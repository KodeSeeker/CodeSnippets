package com.test.sf;

import java.util.HashSet;
import java.util.Set;

/**
 * @version 0.1
 * 
 * @author vmahadevanveeramani.
 * TO DO: Read from file .
 */
public class Scrambler {

	Set<Character> vowels;


	/**
	 * Returns the set of vowels.
	 * 
	 * @param vowels
	 * @return
	 */
	static Set<Character> getVowels(Set<Character> vowels) {
		vowels = new HashSet<Character>();
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		return vowels;
	}

	/**
	 * Returns the allowedSet!
	 * 
	 * @return
	 */
	static Set<String> getAllowedSet() {
		Set<String> allowed = new HashSet<String>();
		allowed.add("AI");
		allowed.add("AY");
		allowed.add("EA");

		allowed.add("EE");

		allowed.add("EO");

		allowed.add("IO");

		allowed.add("OA");

		allowed.add("OO");

		allowed.add("OY");

		allowed.add("YA");
		allowed.add("YO");
		allowed.add("YU");
		allowed.add("BL");
		allowed.add("BR");
		allowed.add("CH");
		allowed.add("CK");

		allowed.add("CL");
		allowed.add("CR");
		allowed.add("DR");
		allowed.add("FL");
		allowed.add("FR");
		allowed.add("CK");
		allowed.add("GH");
		allowed.add("GL");
		allowed.add("GR");
		allowed.add("KL");
		allowed.add("KR");
		allowed.add("KW");
		allowed.add("PF");
		allowed.add("PL");
		allowed.add("PR");
		allowed.add("SC");
		allowed.add("SCH");
		allowed.add("SCR");
		allowed.add("SH");
		allowed.add("SHR");
		allowed.add("SK");//
		allowed.add("SL");
		allowed.add("SM");
		allowed.add("SN");
		allowed.add("SP");
		allowed.add("SQ");
		allowed.add("ST");
		allowed.add("TH");
		allowed.add("THR");
		allowed.add("TR");
		allowed.add("TW");
		allowed.add("WH");//
		allowed.add("WR");

		return allowed;
	}

	/**
	 * Calculates whether a given word is real or not.
	 * 
	 * @param scrambledWord.
	 * @return
	 * 
	 * BUG: Currently works only for even length words. Need to extend to accomodate odd length words as well. 
	 */
	static boolean getRealness(String scrambledWord) {

		Set<Character> vowels = new HashSet<Character>();

		vowels = getVowels(vowels);

		Set<String> allowedList = getAllowedSet();

		// inspect the scrambledWord character by character.
		char[] chars = scrambledWord.toCharArray();

		for (int i = 0; i < chars.length - 1; i++) {


			// handle double consonants as allowed
			if (!vowels.contains(chars[i]) && chars[i] == chars[i + 1]) {
				i++;
				continue;
			}

			// if xor character at i and i+1 are vowel , ie. ONLY one of it can
			// be a vowel and consonant not BOTH.
			// then we we can skip this pair
			if (vowels.contains(chars[i]) ^ vowels.contains(chars[i + 1])) {
				continue;
			}

			// if we have an allowed string of size 3 here starting at i .
			if (i + 2 < chars.length
					&& allowedList.contains(scrambledWord.substring(i, i + 3))) {
				i += 2;
				continue;
			}

			// if we have an allowed string of size 2 here starting at i .
			if (i + 1 < chars.length
					&& allowedList.contains(scrambledWord.substring(i, i + 2))) {

				i += 1;

				continue;

			} else
				return false;
		}

		return true;
	}


	/**
	 * Evaluates whether the degree of scrambling
	 * 
	 * @return
	 * **/
	static Degree evaluator(String originalWord, String scrambledWord) {

		// both are of different lengths
		if (originalWord.length() != scrambledWord.length())
			throw new IllegalArgumentException();
		// Inspect each case.
		// If original word is = to scrambled word .

		if (originalWord.equals(scrambledWord))
			return Degree.not;

		// calculate "real"ness of scrambled word.

		boolean isReal = getRealness(scrambledWord);

		boolean consecutiveSamePlaces = false;

		boolean charactersAtSamePlace = false;
		// check places

		// Walk through original string and toggle flags when words at same
		// index or same consecutive
		// indices in original and scramble are found!
		for (int i = 0; i < originalWord.length() - 1; i++) {

			if (originalWord.charAt(i) == scrambledWord.charAt(i)) {
				charactersAtSamePlace = true;
				if (originalWord.charAt(i + 1) == scrambledWord.charAt(i + 1))
					consecutiveSamePlaces = true;
			}

		}

		// case POOR :

		if (!isReal
				&& (scrambledWord.charAt(0) == originalWord.charAt(0) || consecutiveSamePlaces))
			return Degree.poor;

		// case GOOD.

		if (isReal && !charactersAtSamePlace)
			return Degree.good;

		// Case FAIR.
		return Degree.fair;
	}
	
	
	
	public static void main(String[] args) {
		printer("SPAM", "MAPS");// prints correctly "fair" as expected 
		printer("ONRYI", "IRONY");// prints "fair" instead of good because of bug in getRealness.

	}

	/**
	 * Prints the results in the expected format.
	 */
	static void printer(String originalWord, String scrambledWord) {

		System.out.println(scrambledWord + " is a "
				+ evaluator(originalWord, scrambledWord) + "  scramble of "
				+ originalWord);

	}
}
