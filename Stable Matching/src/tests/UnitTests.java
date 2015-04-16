package tests;

import java.awt.print.Printable;

import algorithm.Match;

public class UnitTests {

	private static String[] dummyMembers = {"yarden", "brandon", "izzy", "ido"};
	private static String[] dummyChoices = {"caretaker", "e.d."};
	/**
	 * @param args
	 */
	public static void main(String[] args){
		testGetAllPermutations();
	}

	private static void testGetAllPermutations() {
		for(Match permutation : Match.getAllPermutations(dummyMembers, dummyChoices)){
			permutation.printMatch();
		}
	}
	
}
