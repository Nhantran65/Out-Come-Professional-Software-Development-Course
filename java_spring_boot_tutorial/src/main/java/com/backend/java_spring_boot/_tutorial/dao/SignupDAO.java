package com.backend.java_spring_boot._tutorial.dao;

import com.backend.java_spring_boot._tutorial.enums.Role;
import lombok.Data;

@Data
public class SignupDAO {

    private String profilepicture;

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private Role role;
}
