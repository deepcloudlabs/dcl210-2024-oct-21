package com.example.exercises;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.City;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise2 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Find the most populated city of each continent
		var mostPopulatedCityOfEachContinent =
		countryDao.findAllCountries()
		          .stream()            // Stream<Country>
		          .map( country -> country.getCities().stream().map( city -> new ContinentCityPair(country.getContinent(), city)).toList()) // Stream<ContinentCitiesPair>
		          .flatMap(List::stream)
		          .collect(Collectors.groupingBy(ContinentCityPair::continent,Collectors.maxBy( (pair1,pair2) -> pair1.city().getPopulation()-pair2.city().getPopulation())));
		mostPopulatedCityOfEachContinent.forEach((continent,pair)->System.out.println("%16s: %s,%d".formatted(continent,pair.get().city().getName(),pair.get().city().getPopulation())));
		          
	}

}

record ContinentCityPair(String continent,City city) {}