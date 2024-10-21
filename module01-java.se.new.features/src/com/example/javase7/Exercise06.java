package com.example.javase7;

public class Exercise06 {

	public static void main(String[] args) {
		String day = "wednesday";
		String message = switch(day) {
			case "monday","tuesday","wednesday","thursday","friday" -> "Work hard!";
			case "saturday","sunday"-> "rest now!";
			default -> {
				throw new IllegalArgumentException("%s is not a valid day.".formatted(day));
			}
		};
		System.out.println(message);
	}

}
