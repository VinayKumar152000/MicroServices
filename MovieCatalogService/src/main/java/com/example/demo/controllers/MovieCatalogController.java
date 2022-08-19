package com.example.demo.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bo.MovieInfo;
import com.example.demo.bo.RatingData;
import com.example.demo.client.MovieInfoClient;
import com.example.demo.client.RatingDataClient;
import com.example.demo.domain.CatalogItem;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

	@Autowired
	MovieInfoClient client;

	@Autowired
	RatingDataClient rclient;

	@GetMapping("/{id}")
	public List<CatalogItem> getCatalog(@PathVariable(value = "id") String userId) {

		MovieInfo movie = client.getMovie();

		RatingData rating = rclient.getRating();

		return Collections.singletonList(new CatalogItem(movie.getName(), "Test", rating.getRating()));

	}
}
