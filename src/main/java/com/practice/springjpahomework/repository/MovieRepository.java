package com.practice.springjpahomework.repository;

import com.practice.springjpahomework.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findAllMovies();

    List<Movie> findAllByReleaseYear(Short releaseYear);

    List<Movie> findAllByRatingGreaterThan(Float rating);

    List<Movie> findAllByTitleContainingIgnoreCase(String keyWord);

    List<Movie> findAllByReleaseYearBetween(Short fromYear, Short toYear);

    List<Movie> findAllByReleaseYearBetweenAndRatingBetween(Short fromYear, Short toYear, Float fromRating, Float toRating);
}