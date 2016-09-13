package financingplanonplanet;

import java.math.BigInteger;

public class Finance {

	public static BigInteger finance(int n) {
		BigInteger row;
		BigInteger sum;

		if (n % 2 == 0) {
			row = BigInteger.valueOf(n).add(BigInteger.ONE).multiply(BigInteger.valueOf(n / 2));
		} else {
			row = BigInteger.valueOf(n).multiply(BigInteger.valueOf(n / 2 + 1));
		}

		sum = row.multiply(BigInteger.valueOf(n + 2));
		
		return sum;
	}
}