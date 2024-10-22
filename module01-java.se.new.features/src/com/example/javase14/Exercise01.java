package com.example.javase14;

import java.util.List;

public class Exercise01 {

	public static void main(String[] args) {
		var jack1 = new Customer("11111111110", "jack bauer", "jack.bauer@mail.com",
				List.of(new Phone(PhoneType.MOBILE, "+905555555")));
		var jack2 = new Customer("11111111110", "jack bauer", "jack.bauer@mail.com",
				List.of(new Phone(PhoneType.MOBILE, "+905555555")));
		System.out.println(jack1);
		System.out.println(jack1.equals(jack2));
		System.out.println(jack1.email());
	}

}

interface Funable { void fun(); }
record Customer(String identity, String fullname, String email, List<Phone> phones) implements Funable{

	@Override
	public void fun() {}
}

record Phone(PhoneType type, String number) {
	public Phone(String number) {
		this(PhoneType.BUSINESS, number);
	}

	@Override
	public String toString() {
		return "Phone*** [type=" + type + ", number=" + number + "]";
	}

}

enum PhoneType {
	HOME, BUSINESS, MOBILE
}