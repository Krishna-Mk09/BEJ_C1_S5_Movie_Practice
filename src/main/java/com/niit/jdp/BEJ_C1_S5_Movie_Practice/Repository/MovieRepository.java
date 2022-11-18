package com.niit.jdp.BEJ_C1_S5_Movie_Practice.Repository;

import com.niit.jdp.BEJ_C1_S5_Movie_Practice.Domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
