package com.example.simulation.application;

import java.util.ServiceLoader;

import com.example.random.service.RandomDoubleService;
import com.example.random.service.RandomIntegerService;
import com.example.simulation.service.SimulationService;
import com.example.simulation.service.business.StandardSimulationService;

public class SimulationApplication {

	public static void main(String[] args) {
		SimulationService simpService = new StandardSimulationService();
		var randomIntegerServices = ServiceLoader.load(RandomIntegerService.class);
		var randomDoubleServices = ServiceLoader.load(RandomDoubleService.class);
		simpService.setRandomIntegerService(randomIntegerServices.findFirst().get());
		simpService.setRandomDoubleService(randomDoubleServices.findFirst().get());
		var randInts = simpService.generateRandomValues(10, 100, 10, true, false);
		System.out.println(randInts);
		var randDoubles = simpService.generateRandomValues(10.0, 100.0, 10, true, false);
		System.out.println(randDoubles);
	}

}
