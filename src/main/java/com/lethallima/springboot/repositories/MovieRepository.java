package com.lethallima.springboot.repositories;

import com.lethallima.springboot.models.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by LethalLima on 12/1/16.
 */
@RepositoryRestResource(itemResourceRel = "movies", path = "movies")
public interface MovieRepository extends CrudRepository<Movie, Integer> {
}
