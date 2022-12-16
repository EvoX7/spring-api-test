package org.api.spring;

import org.api.spring.pojo.Movie;
import org.api.spring.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApiTestApplication implements CommandLineRunner {

	@Autowired
	private MovieService movieService;

	public static void main(String[] args) {
		SpringApplication.run(SpringApiTestApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
//		Movie

		Movie m1 = new Movie("Matrix");
		Movie m2 = new Movie("L'ultimo dei mohicani");
		Movie m3 = new Movie("Shutter island");
		Movie m4 = new Movie("Titanic");
		Movie m5 = new Movie("I guardiani del destino");
		Movie m6 = new Movie("Inception");
		
		movieService.save(m1);
		movieService.save(m2);
		movieService.save(m3);
		movieService.save(m4);
		movieService.save(m4);
		movieService.save(m5);
		movieService.save(m6);
		
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		System.out.println(m5);
		System.out.println(m6);

	}
}