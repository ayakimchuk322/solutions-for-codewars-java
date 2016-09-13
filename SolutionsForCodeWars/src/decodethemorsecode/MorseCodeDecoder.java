package decodethemorsecode;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeDecoder {
	public static String decode(String morseCode) {
		// your brilliant code here, remember that you can access the preloaded
		// Morse code table through MorseCode.get(code)

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
