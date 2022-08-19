package com.example.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.bo.RatingData;

@FeignClient(url = "localhost:8083/ratings/foo", name = "MOVIE-Rating")
public interface RatingDataClient {

	@GetMapping("/{id}")
	public RatingData getRating();
}
