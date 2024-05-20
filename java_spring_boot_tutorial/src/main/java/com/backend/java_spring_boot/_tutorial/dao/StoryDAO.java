package com.backend.java_spring_boot._tutorial.dao;

import lombok.Data;

@Data
public class StoryDAO {

    private int user_id;

    private String title;

    private String content;

    private String image;


}