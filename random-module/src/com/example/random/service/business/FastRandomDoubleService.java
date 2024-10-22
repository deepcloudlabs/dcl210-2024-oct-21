package com.example.random.service.business;

import java.util.concurrent.ThreadLocalRandom;

import com.example.random.service.RandomDoubleService;

public class FastRandomDoubleService implements RandomDoubleService {

	@Override
	public double generate(double min, double max) {
		return ThreadLocalRandom.current().nextDouble(min, max);
	}

}
