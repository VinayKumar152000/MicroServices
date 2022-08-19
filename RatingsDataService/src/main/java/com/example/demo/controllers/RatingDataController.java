package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.RatingData;


@RestController
@RequestMapping("/ratings")
public class RatingDataController {

	@GetMapping("/{id}")
	public RatingData getRating(@PathVariable(value="id") String movieId) {
		return new RatingData(movieId,7);
	}
}

