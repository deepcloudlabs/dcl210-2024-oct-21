package com.example.exercises;

import static java.util.Comparator.comparingLong;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.example.domain.Director;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise1 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the number of movies of each director
        final var movies = movieService.findAllMovies();
        var directorsMovieCounts =
        movies.stream() // Stream<Movie>
              .map(Movie::getDirectors) // Stream<List<Director>>
              .flatMap(List::stream) // Stream<Director>
              .collect(groupingBy(identity(),counting())); // Map<Director,Long>
        Comparator<Entry<Director, Long>> comparingLong = comparingLong(Entry::getValue);
		directorsMovieCounts
             .entrySet().stream().sorted(comparingLong.reversed())
             .forEach(e -> System.out.println(String.format("%s -> %d",e.getKey().getName(),e.getValue())));      
	}

}
