package com.backend.java_spring_boot._tutorial.service.auth;

import com.backend.java_spring_boot._tutorial.dao.SignupDAO;
import com.backend.java_spring_boot._tutorial.dao.UserDAO;

public interface AuthService {
    UserDAO createUser(SignupDAO signupDAO);
}
