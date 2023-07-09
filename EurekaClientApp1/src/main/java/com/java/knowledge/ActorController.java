/**
 * 
 */
package com.java.knowledge;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import jakarta.ws.rs.core.HttpHeaders;

/**
 * @author Viraj Bansode
 *
 *         08-Jul-2023
 */

@RestController
public class ActorController {

	@Autowired
	public RestTemplate restTemplate;

	@Value("${movie-api-url}")
	private String movieApiUrl;

	@GetMapping("/actor/{actorName}")
	public AppResponse getMoviesDetails(@PathVariable String actorName, @RequestHeader Map<String, String> httpHeader) {

		
		  //return restTemplate.getForObject("http://localhost:8081/movies/"+actorName,
		return restTemplate.getForObject(movieApiUrl+actorName,AppResponse.class);
		 
	}

}
