/**
 * 
 */
package com.java.knowledge;

/**
 * @author Viraj Bansode
 *
 * 08-Jul-2023
 */
public class MovieResponse {
	
	public String movieName;
	public String dateOfRelease;
	
	public MovieResponse() {
		// TODO Auto-generated constructor stub
	}
	
	public MovieResponse(String movieName, String dateOfRelease) {
		super();
		this.movieName = movieName;
		this.dateOfRelease = dateOfRelease;
	}

	@Override
	public String toString() {
		return "MovieResponse [movieName=" + movieName + ", dateOfRelease=" + dateOfRelease + "]";
	}
}
