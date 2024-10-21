package com.example.javase7;

public class Exercise04 {

	public static void main(String[] args) {
		String day = "wednesday";
		switch(day) {
			case "monday","tuesday","wednesday","thursday","friday" -> {
				System.out.println("Work hard!");
			}
			case "saturday","sunday"-> {
				System.out.println("rest now!");
			}
			default -> {
				throw new IllegalArgumentException("%s is not a valid day.".formatted(day));
			}
		}
	}

}
