package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.bo.MovieInfo;

@FeignClient(url = "localhost:8081/movies/foo", name = "MOVIE-INFO")
public interface MovieInfoClient {

	@GetMapping("/{id}")
	public MovieInfo getMovie();
}
