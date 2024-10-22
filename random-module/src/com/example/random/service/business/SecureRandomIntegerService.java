package com.example.random.service.business;

import java.security.SecureRandom;
import java.util.Random;

import com.example.random.service.RandomIntegerService;

public class SecureRandomIntegerService implements RandomIntegerService {

	private Random secureRandom = new SecureRandom();

	@Override
	public int generate(int min, int max) {
		return secureRandom.nextInt(min, max) ;
	}

}
