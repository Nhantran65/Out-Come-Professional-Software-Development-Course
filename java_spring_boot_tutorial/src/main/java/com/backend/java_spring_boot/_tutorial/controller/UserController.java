package com.backend.java_spring_boot._tutorial.controller;

import com.backend.java_spring_boot._tutorial.dao.UserDAO;
import com.backend.java_spring_boot._tutorial.entity.UserEntity;
import com.backend.java_spring_boot._tutorial.repository.UserRepository;
import com.backend.java_spring_boot._tutorial.service.jwt.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/me")
public class UserController {

    private final UserDetailsServiceImpl userDetailsService;
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserDetailsServiceImpl userDetailsService, UserRepository userRepository) {
        this.userDetailsService = userDetailsService;
        this.userRepository = userRepository;
    }

    @GetMapping
    public UserEntity getCurrentUser() {
        // Get Current user from UserDetailsServiceImpl
        UserDetails userDetails = userDetailsService
                .loadUserByUsername(userDetailsService.getCurrentUser().getUsername());
        String email = userDetails.getUsername();

        // Query to Database to get User information by email from User Details
        return userRepository.findFirstByEmail(email);
    }

    @PutMapping("/update")
    public UserEntity updateUserDetails(@RequestBody UserDAO updatedUser) {
        // Get current user from UserDetails
        UserEntity currentUser = this.getCurrentUser();

        // Check valid User
        if (currentUser != null) {
            // Update User Information
            currentUser.setFirstname(updatedUser.getFirstname());
            currentUser.setLastname(updatedUser.getLastname());
            currentUser.setProfilePicture(updatedUser.getProfilepicture());
            // Save Modification from User into Database
            return userRepository.save(currentUser);
        } else {
            return null;
        }
    }
}
