package com.abade.first_api.repository;

import com.abade.first_api.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

//Interface that extends Jpa passing the entity and the id type as generics
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
