package com.example.exercises;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise8 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Group the movies by the year and list them
		Collection<Movie> movies = movieService.findAllMovies();
        var moviesByYear =
        movies.stream()
              .collect(Collectors.groupingBy(Movie::getYear,Collectors.toList()));
        moviesByYear
           .entrySet()
           .stream()
           .sorted(Comparator.comparingInt(Entry::getKey))
           .forEach(entry -> System.out.println("%d: (%d) %s".formatted(entry.getKey(),entry.getValue().size(),entry.getValue().stream().map(Movie::getTitle).sorted().collect(Collectors.joining(",", "[", "]")))));
	}

}
