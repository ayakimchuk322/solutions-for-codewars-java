package recoverasecretstringfromrandomtriplets;

import java.util.ArrayList;

public class SecretDetective {

	public String recoverSecret(char[ ][ ] triplets) {

		String secretString = new String();


		for (int i = 0; i < triplets.length;) {
			boolean contains = false;

			char first = triplets[ i ][ 0 ];

			char second;
			char third;

			for (int j = 0; j < triplets.length; j++) {
				second = triplets[ j ][ 1 ];
				third = triplets[ j ][ 2 ];

				if (secretString.contains(String.valueOf(first))
						|| first == second || first == third) {
					contains = true;
					break;
				}
			}

			if (!contains) {
				secretString += first;

				for (char[ ] t : triplets) {

					ArrayList<Character> tempList = new ArrayList<>();

					for (char c : t) {
						if (c != first) {
							tempList.add(c);
						}
					}

					char[ ] tt = new char[ tempList.size() ];

					for (int k = 0; k < tt.length; k++) {
						tt[ k ] = (char) tempList.get(k);
					}

					t = tt;
				}

				i = 0;

				continue;
			} else {
				i++;
			}
		}


		return secretString;
	}
}
