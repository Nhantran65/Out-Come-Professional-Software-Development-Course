package com.backend.java_spring_boot._tutorial.service.auth;

import com.backend.java_spring_boot._tutorial.dao.SignupDAO;
import com.backend.java_spring_boot._tutorial.dao.UserDAO;
import com.backend.java_spring_boot._tutorial.entity.UserEntity;
import com.backend.java_spring_boot._tutorial.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserRepository userRepository;

    // createUser method to register a new user
    @Override
    public UserDAO createUser(SignupDAO signupDAO) {
        // Extract user details from the provided DTO
        String email = signupDAO.getEmail();

        // Check if a user with the same email already exists
        UserEntity existingUser = userRepository.findFirstByEmail(email);

        if (existingUser != null) {
            // Throw an exception if the email is already in use
            throw new EmailAlreadyExistsException("Email already exists in our system!");
        }

        // Create a new User entity and set its properties
        UserEntity user = new UserEntity();
        user.setFirstname(signupDAO.getFirstname());
        user.setLastname(signupDAO.getLastname());
        user.setRole(signupDAO.getRole());
        user.setEmail(email);
        // Use BCryptPasswordEncoder to hash and store the user's password securely
        user.setPasswordHash(new BCryptPasswordEncoder().encode(signupDAO.getPassword()));

        // Save the new user to the database
        UserEntity createdUser = userRepository.save(user);

        // Map the created User entity to a UserDTO for the response
        UserDAO userDAO = new UserDAO();
        userDAO.setId(createdUser.getId());
        userDAO.setEmail(createdUser.getEmail());
        userDAO.setFirstname(createdUser.getFirstname());
        userDAO.setLastname(createdUser.getLastname());
        userDAO.setRole(createdUser.getRole());

        return userDAO;
    }


}