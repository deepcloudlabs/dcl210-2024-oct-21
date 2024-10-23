package com.example.exercises;

import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.domain.Genre;
import com.example.domain.Movie;
import com.example.service.InMemoryMovieService;
import com.example.service.MovieService;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise7 {
	private static final MovieService movieService = InMemoryMovieService.getInstance();

	public static void main(String[] args) {
		// Find the list of movies having the genres "Drama" and "Comedy" only
		Genre drama = movieService.findAllGenres().stream().filter(genre -> genre.getName().equals("Drama")).findFirst().get();
		Genre comedy = movieService.findAllGenres().stream().filter(genre -> genre.getName().equals("Comedy")).findFirst().get();
        Predicate<Movie> isDrama = movie -> movie.getGenres().contains(drama);
        Predicate<Movie> isComedy = movie -> movie.getGenres().contains(comedy);
		Predicate<Movie> has2Genres = movie -> movie.getGenres().size() == 2;
		movieService.findAllMovies()
                    .stream()
                    .filter(isDrama.and(isComedy).and(has2Genres))
                    .forEach(movie -> System.out.println("%s: %s".formatted(movie.getTitle(),movie.getGenres().stream().map(Genre::getName).collect(Collectors.joining(",", "[", "]")))));
	}

}
