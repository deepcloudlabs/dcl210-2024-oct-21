package com.example.exercises;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

import com.example.dao.CityDao;
import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;
import com.example.domain.Country;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise4 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();
	private static final CityDao cityDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the highest populated capital city
		var highPopCapital =
		countryDao.findAllCountries()
		          .stream()                    // Stream<Country>
		          .map(Country::getCapital)    // Stream<Integer>
		          .filter(Exercise4::positive) // Stream<Integer>
		          .map(cityDao::findCityById)  // Stream<City>
		          .collect(maxBy(comparing(City::getPopulation)));
		highPopCapital.ifPresent(System.out::println);
	}

	public static boolean positive(int value) {
		return value >= 0;
	}

	private static boolean positive(Integer integer1) {
		return false;
	}
}
