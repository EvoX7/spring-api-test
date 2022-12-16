package org.api.spring.service;

import java.util.List;

import org.api.spring.pojo.Movie;
import org.api.spring.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

	@Autowired
	private MovieRepo movieRepo;

	public void save(Movie movie) {
		movieRepo.save(movie);
	}

	public List<Movie> findAll() {
		return movieRepo.findAll();
	}

	public List<Movie> findByName(String name) {
		return movieRepo.findByNameContainingIgnoreCase(name);
	}

}
