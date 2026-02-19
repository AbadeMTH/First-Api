package com.abade.first_api.controller;

import com.abade.first_api.entity.Movie;
import com.abade.first_api.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    //MovieService injection
    private final MovieService movieService;

    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }

    @PostMapping
    public List<Movie> create(@RequestBody Movie movie){ //@RequestBody says that the param is comming from the body of requisition
        return movieService.create(movie);
    }

    @GetMapping
    public List<Movie> list(){
        return movieService.list();
    }

    @PutMapping
    public List<Movie> update(@RequestBody Movie movie){
        return movieService.update(movie);
    }

    @DeleteMapping("{id}") //Says that id will be passed in the path to the PathVariable param id
    public List<Movie> delete(@PathVariable("id") Long id){
        return movieService.delete(id);
    }

}
