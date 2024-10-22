package com.example.javase11;

public class Exercise02 {

	public static void main(String[] args) {
		String json = """
				{
					"x": 100,
					"y": 200,
					"radius": 300,
					"color": "red"
				}
								""";
		String xml = """
				<?xml version="1.0"?>
				<circle x="100" y="200">
					<radius>300</radius>
					<color>Red</color>
				</circle>
								""";

		String SQL = """
				SELECT NAME, POPULATION, SURFACEAREA, REGION
				FROM COUNTRIES
				WHERE CONTINENT = "ASIA"
				""";
		
		System.out.println(json);
		System.out.println(xml);
		System.out.println(SQL);
	}
}