package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.MovieInfo;

@RestController
@RequestMapping("/movies")
public class MovieInfoController {

	@GetMapping("/{id}")
	public MovieInfo getMovie(@PathVariable(value="id") String movieId) {
		return new MovieInfo(movieId,"Avengers End Game");
	}
}
