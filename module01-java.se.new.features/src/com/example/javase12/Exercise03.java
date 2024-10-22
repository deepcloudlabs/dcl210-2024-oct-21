package com.example.javase12;

public class Exercise03 {

	public static void main(String[] args) {
		String day = "wednesday";
		switch(day) {
		case "monday","tuesday","wednesday","thursday","friday":
			System.out.println("Work hard!");
			break;
		case "saturday","sunday":
			System.out.println("rest now!");
			break;
		default:
			throw new IllegalArgumentException("%s is not a valid day.".formatted(day));
		}

	}

}
