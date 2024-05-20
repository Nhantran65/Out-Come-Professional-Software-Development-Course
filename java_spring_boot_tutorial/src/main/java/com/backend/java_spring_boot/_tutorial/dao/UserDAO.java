package com.backend.java_spring_boot._tutorial.dao;

import com.backend.java_spring_boot._tutorial.enums.Role;
import lombok.Data;

@Data
public class UserDAO {

    private int id;

    private String firstname;

    private String lastname;

    private String email;

    private Role role;

    private String profilepicture;
}
