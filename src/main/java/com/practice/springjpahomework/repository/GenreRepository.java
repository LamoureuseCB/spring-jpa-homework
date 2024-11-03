package com.practice.springjpahomework.repository;

import com.practice.springjpahomework.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
