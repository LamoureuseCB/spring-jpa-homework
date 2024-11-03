package com.practice.springjpahomework.controller;

import com.practice.springjpahomework.model.Movie;
import com.practice.springjpahomework.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")

public class MovieController {
    private final MovieRepository movieRepository;
@GetMapping
public List<Movie> findAllMovies(){
    return movieRepository.findAllMovies();
}
    @GetMapping("/releaseYear/{releaseYear}")
    public List<Movie> findMoviesByReleaseYear(@PathVariable Short releaseYear) {
        return movieRepository.findAllByReleaseYear(releaseYear);
    }

    @GetMapping("/rating/greaterThan/{rating}")
    public List<Movie> findMoviesByRatingGreaterThan(@PathVariable Float rating) {
        return movieRepository.findAllByRatingGreaterThan(rating);
    }

    @GetMapping("/title/{keyWord}")
    List<Movie> findMoviesByTitleContainingIgnoreCase(@PathVariable String keyWord) {
        return movieRepository.findAllByTitleContainingIgnoreCase(keyWord);
    }

    @GetMapping("/releaseYear/between")
    public List<Movie> findMoviesByReleaseYearBetween(
            @RequestParam Short fromYear,
            @RequestParam Short toYear) {
        return movieRepository.findAllByReleaseYearBetween(fromYear, toYear);
    }

    @GetMapping("/releaseYear/rating/between")
    public List<Movie> findMoviesByReleaseYearBetweenAndRatingBetween(
            @RequestParam Short fromYear,
            @RequestParam Short toYear,
            @RequestParam Float fromRating,
            @RequestParam Float toRating) {
        return movieRepository.findAllByReleaseYearBetweenAndRatingBetween(fromYear, toYear, fromRating, toRating);
    }

}
