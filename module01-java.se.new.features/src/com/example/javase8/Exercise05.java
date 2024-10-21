package com.example.javase8;

public class Exercise05 {
	public static void main(String[] args) {

	}
}

sealed abstract class Animal permits Spider, Cat {}
sealed interface Pet permits Cat{}

final class Spider extends Animal {}
sealed class Cat extends Animal implements Pet  permits VanCat {}
final class VanCat extends Cat {}