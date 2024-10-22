package com.example.random.service.business;

import java.security.SecureRandom;
import java.util.Random;

import com.example.random.service.RandomDoubleService;

public class SecureRandomDoubleService implements RandomDoubleService {

	private Random secureRandom = new SecureRandom();

	@Override
	public double generate(double min, double max) {
		return secureRandom.nextDouble(min, max) ;
	}

}
