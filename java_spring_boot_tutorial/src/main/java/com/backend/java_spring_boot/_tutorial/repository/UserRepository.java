package com.backend.java_spring_boot._tutorial.repository;

import com.backend.java_spring_boot._tutorial.entity.UserEntity;
import com.backend.java_spring_boot._tutorial.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findFirstByEmail(String email);

    List<UserEntity> findAllByRole(Role role);
}
