package org.api.spring.repo;

import java.util.List;
import org.api.spring.pojo.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

	List<Movie> findByNameContainingIgnoreCase(String name);

}

