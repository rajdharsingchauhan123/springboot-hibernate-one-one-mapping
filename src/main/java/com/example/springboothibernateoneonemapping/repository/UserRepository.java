package com.example.springboothibernateoneonemapping.repository;

import com.example.springboothibernateoneonemapping.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
