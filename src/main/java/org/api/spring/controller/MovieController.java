package org.api.spring.controller;

import java.util.List;

import org.api.spring.pojo.Movie;
import org.api.spring.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/1/movie")
@CrossOrigin("*")
public class MovieController {

	@Autowired
	private MovieService movieService;

	@GetMapping("/all")
	public List<Movie> getAll() {
		List<Movie> movies = movieService.findAll();
		return movies;
	}

}
