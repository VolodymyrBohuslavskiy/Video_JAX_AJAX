package com.example.tryajax.dao;

import com.example.tryajax.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
