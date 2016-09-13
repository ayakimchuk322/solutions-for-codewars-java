package romannumeralsencoder;

public class Conversion {

	public String solution(int n) {

		StringBuilder result = new StringBuilder();

		String numberAsString = String.valueOf(n);

		int numberLength = numberAsString.length();

		int[] digits = new int[numberLength];

		for (int i = 0; i < numberLength; i++) {
			digits[i] = Character.digit(numberAsString.charAt(i), 10);
		}

		for (int i = 0; i < numberLength; i++) {

			int digit = digits[i];

			if (numberLength - i == 4) {

				switch (digit) {
				case 1:
					result.append("M");
					break;
				case 2:
					result.append("MM");
					break;
				case 3:
					result.append("MMM");
					break;
				default:
					break;
				}
			} else if (numberLength - i == 3) {
				
				switch (digit) {
				case 1:
					result.append("C");
					break;
				case 2:
					result.append("CC");
					break;
				case 3:
					result.append("CCC");
					break;
				case 4:
					result.append("CD");
					break;
				case 5:
					result.append("D");
					break;
				case 6:
					result.append("DC");
					break;
				case 7:
					result.append("DCC");
					break;
				case 8:
					result.append("DCCC");
					break;
				case 9:
					result.append("CM");
					break;
				default:
					break;
				}
			} else if (numberLength - i == 2) {
				
				switch (digit) {
				case 1:
					result.append("X");
					break;
				case 2:
					result.append("XX");
					break;
				case 3:
					result.append("XXX");
					break;
				case 4:
					result.append("XL");
					break;
				case 5:
					result.append("L");
					break;
				case 6:
					result.append("LX");
					break;
				case 7:
					result.append("LXX");
					break;
				case 8:
					result.append("LXXX");
					break;
				case 9:
					result.append("XC");
					break;
				default:
					break;
				}
			} else if (numberLength - i == 1) {
				
				switch (digit) {
				case 1:
					result.append("I");
					break;
				case 2:
					result.append("II");
					break;
				case 3:
					result.append("III");
					break;
				case 4:
					result.append("IV");
					break;
				case 5:
					result.append("V");
					break;
				case 6:
					result.append("VI");
					break;
				case 7:
					result.append("VII");
					break;
				case 8:
					result.append("VIII");
					break;
				case 9:
					result.append("IX");
					break;
				default:
					break;
				}
			}
		}

		return result.toString();
	}
}
