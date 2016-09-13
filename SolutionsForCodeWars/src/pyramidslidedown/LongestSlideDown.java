package pyramidslidedown;

public class LongestSlideDown {

	public static int longestSlideDown(int[][] pyramid) {
		// Code Goes Here..
		int[] interim = null;

		for (int i = pyramid.length - 2; i >= 0; i--) {

			interim = new int[pyramid[i].length];

			for (int j = 0; j < pyramid[i].length; j++) {
				interim[j] += (pyramid[i + 1][j] > pyramid[i + 1][j + 1])
						? (pyramid[i][j] + pyramid[i + 1][j])
						: (pyramid[i][j] + pyramid[i + 1][j + 1]);
			}

			System.arraycopy(interim, 0, pyramid[i], 0, interim.length);
		}

		return interim[0];
	}

}
