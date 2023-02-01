package com.example.springboothibernateoneonemapping.repository;

import com.example.springboothibernateoneonemapping.entity.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile,Long> {
}
