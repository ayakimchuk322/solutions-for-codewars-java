package decodethemorsecodeadvanced;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeDecoder {
	public static String decodeBits(String bits) {

		// new variable to proceed with
		String result = bits;

		// getting rid of leading and trailing zeroes
		result = result.substring(result.indexOf("1"));
		result = result.substring(0, result.lastIndexOf("1") + 1);

		// check if bits is not one long dot
		if (!result.contains("0")) {
			return ".";
		}

		int dotLength, dashLength, spaceWordsLength, zeroesLength;

		String dot = "";
		String dash = "";
		String zeroes = "0000000000";

		// use regex to find out dash, dot and "zeroes between bits" length
		// finding dash length
		String dashRegex = "1+";
		Pattern pattern = Pattern.compile(dashRegex);
		Matcher matcher = pattern.matcher(result);

		while (matcher.find()) {
			if (matcher.group().length() > dash.length()) {
				dash = matcher.group();
			}
		}

		// finding dot length
		String dotRegex = "1+";
		pattern = Pattern.compile(dotRegex);
		matcher = pattern.matcher(result);

		while (matcher.find()) {
			if (matcher.group().length() < dash.length()) {
				dot = matcher.group();
			}
		}

		if (dot.length() == 0) {
			dot = dash;
		}

		// finding minimum zeroes length
		String zeroesRegex = "0+";
		Pattern patternZeroes = Pattern.compile(zeroesRegex);
		Matcher matcherZeroes = patternZeroes.matcher(result);

		while (matcherZeroes.find()) {
			if (matcherZeroes.group().length() <= zeroes.length()) {
				zeroes = matcherZeroes.group();
			}
		}

		// check if dot is less than dash
		dotLength = dot.length();
		dashLength = dash.length();

		if (dotLength < dashLength) {
			// proceed with standard algorithm
			// need to define space length between words
			spaceWordsLength = dotLength * 7;

			String dashesRegex = "1{" + dashLength + "}";
			String dotsRegex = "1{" + dotLength + "}";
			String spaceWordsRegex = "0{" + spaceWordsLength + "}";
			String spaceCharachtersRegex = "0{" + dashLength + "}";
			String spaceBitsRegex = "0{" + dotLength + "}";

			result = result.replaceAll(dashesRegex, "-").replaceAll(dotsRegex, ".").replaceAll(spaceWordsRegex, "   ")
					.replaceAll(spaceCharachtersRegex, " ").replaceAll(spaceBitsRegex, "").trim();
		} else {
			zeroesLength = zeroes.length();

			if (zeroesLength <= dotLength) {
				if (dotLength % 3 == 0 && zeroesLength % 3 != 0) {
					result = result.replaceAll("1+", "-").replaceAll("0+", "");
				} else {
					result = result.replaceAll("1+", ".").replaceAll("0+", "");
				}
			} else {
				result = result.replaceAll("1+", ".").replaceAll("0+", " ");
			}
		}

		return result;
	}

	public static String decodeMorse(String morseCode) {
		morseCode.trim();

		String regex = "[\\.[\\-]]+|\\p{Blank}{3}";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(morseCode);

		ArrayList<String> tokens = new ArrayList<>();

		while (matcher.find()) {
			tokens.add(matcher.group());
		}

		StringBuilder result = new StringBuilder();

		for (String s : tokens) {
			if (!s.equals("   ")) {
				result.append(MorseCode.get(s));
			} else {
				result.append(" ");
			}
		}

		return result.toString().trim();
	}
}
