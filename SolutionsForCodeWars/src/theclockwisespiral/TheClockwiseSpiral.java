package theclockwisespiral;

public class TheClockwiseSpiral {
	public static int[][] createSpiral(int N) {

		if (N < 1) {
			return new int[0][0];
		}

		int[][] spiral = new int[N][N];

		int number = 1;
		int c1 = 0;
		int c2 = N - 1;
		int r1 = 0;
		int r2 = N - 1;

		while (number <= N * N) {
			for (int i = c1; i <= c2; i++) {
				spiral[r1][i] = number++;
			}

			for (int j = r1 + 1; j <= r2; j++) {
				spiral[j][c2] = number++;
			}

			for (int i = c2 - 1; i >= c1; i--) {
				spiral[r2][i] = number++;
			}

			for (int j = r2 - 1; j >= r1 + 1; j--) {
				spiral[j][c1] = number++;
			}

			c1++;
			c2--;
			r1++;
			r2--;
		}

		return spiral;
	}
}
