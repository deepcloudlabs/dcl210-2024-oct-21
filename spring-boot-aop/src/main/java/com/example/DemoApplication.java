package com.example;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.example.service.Calculator;

@SpringBootApplication
@EnableCaching
public class DemoApplication implements ApplicationRunner{
	private final Calculator calculator;
	
	public DemoApplication(Calculator calculator) {
		this.calculator = calculator;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("3+5=%f".formatted(calculator.add(3, 5)));
		System.out.println("3-5=%f".formatted(calculator.sub(3, 5)));
		System.out.println("3*5=%f".formatted(calculator.mul(3, 5)));
		System.out.println("3/5=%f".formatted(calculator.div(3, 5)));
	}

}
