package com.backend.java_spring_boot._tutorial.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.java_spring_boot._tutorial.dao.SignupDAO;
import com.backend.java_spring_boot._tutorial.dao.UserDAO;
import com.backend.java_spring_boot._tutorial.entity.UserEntity;
import com.backend.java_spring_boot._tutorial.enums.Role;
import com.backend.java_spring_boot._tutorial.repository.UserRepository;
import com.backend.java_spring_boot._tutorial.service.auth.AuthService;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Autowire the AuthService to handle user sign-up
    @Autowired
    private AuthService authService;

    public Optional<UserEntity> getUser(int id) {
        return userRepository.findById(id);
    }

    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    public UserEntity addUser(UserDAO user) {
        UserEntity newUser = new UserEntity();

        newUser.setFirstname(user.getFirstname());
        newUser.setLastname(user.getLastname());
        newUser.setEmail(user.getEmail());
        newUser.setRole(user.getRole());

        return userRepository.save(newUser);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public UserEntity updateUser(UserDAO userUpdate, int id) {
        Optional<UserEntity> optionalUserEntity = userRepository.findById(id);

        if (optionalUserEntity.isPresent()) {
            UserEntity user = optionalUserEntity.get();

            user.setFirstname(userUpdate.getFirstname());
            user.setLastname(userUpdate.getLastname());
            user.setEmail(userUpdate.getEmail());
            user.setRole(userUpdate.getRole());

            return userRepository.save(user);
        } else {
            return null;
        }
    }
}
