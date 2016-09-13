package divisibleints;

public class Kata {

	public static int getCount(int n) {
		// your code
		int result = 0;
		int nLength = Integer.toString(n).length();

		if (n == 0) {
			return result;
		}

		if (nLength == 1) {
			return result;
		}

		for (int i = 0; i < nLength; i++) {
			for (int j = i + 1; j <= nLength; j++) {
				String subN = Integer.toString(n).substring(i, j);
				try {
					if (n % Integer.parseInt(subN) == 0) {
						result++;
					}
				} catch (ArithmeticException e) {
					continue;
				}

			}
		}

		return --result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
