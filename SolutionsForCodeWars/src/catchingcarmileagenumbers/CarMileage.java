package catchingcarmileagenumbers;

import java.util.Arrays;

public class CarMileage {

	public static int isInteresting(int number, int[] awesomePhrases) {

		// A number is only interesting if it is greater than 99!
		if (number < 98) {
			return 0;
		}

		// check in phrases array using binary search, array should be sorted
		// prior to search
		Arrays.sort(awesomePhrases);

		if (number > 99 && isAwesomePhrase(number, awesomePhrases)) {
			return 2;
		}

		if (number + 1 > 99 && isAwesomePhrase(number + 1, awesomePhrases)) {
			return 1;
		}

		if (number + 2 > 99 && isAwesomePhrase(number + 2, awesomePhrases)) {
			return 1;
		}

		int[] digits = splitByDigits(number);

		if (number > 99 && (isAllZeroes(digits) || isSameDigits(digits) || isIncrementing(digits)
				|| isDecrementing(digits) || isPalindrome(digits))) {
			return 2;
		}

		digits = splitByDigits(number + 1);

		if (number + 1 > 99 && (isAllZeroes(digits) || isSameDigits(digits) || isIncrementing(digits)
				|| isDecrementing(digits) || isPalindrome(digits))) {
			return 1;
		}

		digits = splitByDigits(number + 2);

		if (number + 2 > 99 && (isAllZeroes(digits) || isSameDigits(digits) || isIncrementing(digits)
				|| isDecrementing(digits) || isPalindrome(digits))) {
			return 1;
		}

		return 0;
	}

	public static int[] splitByDigits(int number) {
		// splitting number in array of digits

		byte[] stringDigits = String.valueOf(number).getBytes();

		int[] digits = new int[stringDigits.length];

		for (int i = 0; i < stringDigits.length; i++) {
			digits[i] = Character.digit(stringDigits[i], 10);
		}

		return digits;
	}

	public static boolean isAwesomePhrase(int number, int[] awesomePhrases) {
		// search array of phrases for a number
		if (Arrays.binarySearch(awesomePhrases, number) >= 0) {
			return true;
		}

		return false;
	}

	public static boolean isAllZeroes(int[] digits) {
		// check - Any digit followed by all zeros
		boolean allZeroes = true;

		for (int i = 1; i < digits.length; i++) {
			if (digits[i] != 0) {
				allZeroes = false;
				break;
			}
		}

		return allZeroes;
	}

	public static boolean isSameDigits(int[] digits) {
		// check - Every digit is the same number
		boolean sameDigits = true;

		for (int i = 0; i < digits.length - 1; i++) {
			if (digits[i] != digits[i + 1]) {
				sameDigits = false;
				break;
			}
		}

		return sameDigits;
	}

	public static boolean isIncrementing(int[] digits) {
		// check - The digits are sequential, incementing
		boolean incrementing = true;

		for (int i = 0; i < digits.length - 1; i++) {
			if (digits[i] != digits[i + 1] - 1) {

				if (i == (digits.length - 2)) {
					if (digits[i] == 9 && digits[i + 1] == 0) {
						incrementing = true;
						break;
					}
				}

				incrementing = false;
				break;
			}
		}

		return incrementing;
	}

	public static boolean isDecrementing(int[] digits) {
		// check - The digits are sequential, decrementing
		boolean decrementing = true;

		for (int i = 0; i < digits.length - 1; i++) {
			if (digits[i] != digits[i + 1] + 1) {

				if (i == (digits.length - 2)) {
					if (digits[i] == 1 && digits[i + 1] == 0) {
						decrementing = true;
						break;
					}
				}

				decrementing = false;
				break;
			}
		}

		return decrementing;
	}

	public static boolean isPalindrome(int[] digits) {
		// check - The digits are a palindrome
		boolean palindrome = true;

		for (int i = 0; i < digits.length; i++) {
			if (digits[i] != digits[digits.length - 1 - i]) {
				palindrome = false;
				break;
			}
		}

		return palindrome;
	}
}
