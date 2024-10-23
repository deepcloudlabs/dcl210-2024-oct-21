package com.example.exercises;

import java.util.Comparator;

import com.example.dao.CountryDao;
import com.example.dao.InMemoryWorldDao;
import com.example.domain.Country;

/**
 * 
 * @author Binnur Kurt <binnur.kurt@gmail.com>
 *
 */
public class Exercise6 {
	private static final CountryDao countryDao = InMemoryWorldDao.getInstance();

	public static void main(String[] args) {
		// Sort the countries by number of their cities in descending order
        Comparator<Country> comparingByCityCount = Comparator.comparing(country -> country.getCities().size());
		countryDao.findAllCountries()
                  .stream()
                  .sorted(comparingByCityCount.reversed())
                  .forEach(System.out::println);
	}

}
