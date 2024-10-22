package com.example.random.service.business;

import java.util.concurrent.ThreadLocalRandom;

import com.example.random.service.RandomIntegerService;

public class FastRandomIntegerService implements RandomIntegerService {

	@Override
	public int generate(int min, int max) {
		return ThreadLocalRandom.current().nextInt(min, max);
	}

}
