package com.example.javase8;

public class Exercise01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AAA aref1 = new BBB();
		AAA aref2 = new CCC();
		AAA aref3 = new DDD();
		// AAA aref5 = new EEE();
		if (aref1 instanceof CCC) {}
		if (aref2 instanceof DDD) {}
		// if (aref1 instanceof EEE) {}
		if (aref1 instanceof III) {}
		if (aref1 instanceof JJJ) {}
		JJJ ref5 = (JJJ) new EEE();
		JJJ ref6 = (JJJ) new CCC();
		JJJ ref7 = (JJJ) new BBB();

	}

}

interface III {}
interface JJJ {}
interface KKK {}
interface MMM extends III, JJJ, KKK {} // multiple inheritance

abstract class AAA implements III {}
class BBB extends AAA {}
class CCC extends AAA {}
class DDD extends CCC {}
class EEE {}
class FFF implements III, JJJ, KKK {}
class UUU {}
class VVV {}
// class XXX extends UUU, VVV {}
