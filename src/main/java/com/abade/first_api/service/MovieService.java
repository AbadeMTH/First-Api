package com.abade.first_api.service;

import com.abade.first_api.entity.Movie;
import com.abade.first_api.repository.MovieRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //Defines that this class is a Service
public class MovieService {
    //Repository injection
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    //Methods

    /**
     * Save in database a new Movie
     * @param movie - A Movie instance
     * @return List<Movie>
     */
    public List<Movie> create(Movie movie){
        movieRepository.save(movie);
        return list();
    }

    /**
     * List all movies
     * @return List<Movie>
     */
    public List<Movie> list(){
        return movieRepository.findAll(
                Sort.by("name").ascending()
        );
    }

    /**
     * Update a movie
     * @param movie - The movie that will be updated
     * @return List<Movie>
     */
    public List<Movie> update(Movie movie){
        movieRepository.save(movie);
        return list();
    }

    /**
     * Delete a movie based in id
     * @param id - id of the movie that will be deleted
     * @return List<Movie>
     */
    public List<Movie> delete(Long id){
        movieRepository.deleteById(id);
        return list();
    }
}
