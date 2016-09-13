package triangulartreasure;

public class Triangular {
	public static int triangular(int n) {

		if (n <= 0) {
			return 0;
		}

		if (n == 1) {
			return 1;
		} else {
			return n + triangular(n - 1);
		}
	}
}