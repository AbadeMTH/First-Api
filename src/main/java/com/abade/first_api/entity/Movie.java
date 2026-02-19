package com.abade.first_api.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="movies")
public class Movie {
    @Id //Shows to code that it an identifier
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Auto generates the id value
    private Long id;
    private String name;
    private String gender;
    private int minimalAge;
}
