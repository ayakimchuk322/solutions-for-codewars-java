package validbraces;

import java.util.ArrayList;
import java.util.List;

public class BraceChecker {
	public boolean isValid(String braces) {
		// Add code here
		if (braces.length() % 2 != 0) {
			return false;
		}

		char[] bracesArray = braces.toCharArray();
		List<Character> bracesList = new ArrayList<>();

		for (char c : bracesArray) {
			bracesList.add(c);
		}

		for (int i = 0; i < bracesList.size() - 1;) {
			if (bracesList.get(i) == '(' && bracesList.get(i + 1) == ')') {
				bracesList.remove(i);
				bracesList.remove(i);
				i = 0;
				continue;
			} else if (bracesList.get(i) == '['
					&& bracesList.get(i + 1) == ']') {
				bracesList.remove(i);
				bracesList.remove(i);
				i = 0;
				continue;
			} else if (bracesList.get(i) == '{'
					&& bracesList.get(i + 1) == '}') {
				bracesList.remove(i);
				bracesList.remove(i);
				i = 0;
				continue;
			}

			i++;
		}

		return (bracesList.isEmpty())
				? true
				: false;
	}
}
