package com.backend.java_spring_boot._tutorial.repository;

import com.backend.java_spring_boot._tutorial.entity.StoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryRepository extends JpaRepository<StoryEntity, Integer> {

}