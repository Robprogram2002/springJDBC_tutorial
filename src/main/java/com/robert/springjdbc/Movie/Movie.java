package com.robert.springjdbc.Movie;

import com.robert.springjdbc.Actor.Actor;

import java.time.LocalDate;
import java.util.List;

public record Movie(Integer id,
                    String name,
                    List<Actor> actors,
                    LocalDate releaseDate) {
}