/**
 * 
 */
package com.java.knowledge;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Viraj Bansode
 *
 * 08-Jul-2023
 */
@RestController
public class MovieController {
	
	@GetMapping("/movies/{actor}")
	public AppResponse searchActorsMovies(@PathVariable String actor) {
		
		List<MovieResponse> list = Arrays.asList(
				new MovieResponse(actor+"'s First Love","12-12-2018")
				,new MovieResponse("Disco Dancer","03-07-2021"));
		return new AppResponse(list);
	}
	

}
