package com.example.tryajax.dao;

import com.example.tryajax.models.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatDao extends JpaRepository<Cat, Integer> {
}
