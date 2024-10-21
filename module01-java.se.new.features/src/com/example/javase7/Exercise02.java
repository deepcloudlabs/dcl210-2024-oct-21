package com.example.javase7;

public class Exercise02 {

	public static void main(String[] args) {
		String day = "wednesday";
		switch(day) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
			System.out.println("Work hard!");
			break;
		case "saturday":
		case "sunday":
			System.out.println("rest now!");
			break;
		default:
			throw new IllegalArgumentException("%s is not a valid day.".formatted(day));
		}

	}

}
