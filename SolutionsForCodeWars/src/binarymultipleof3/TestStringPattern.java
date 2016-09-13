package binarymultipleof3;

public class TestStringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sbPattern = new StringBuilder();

		sbPattern.append("0*");
		sbPattern.append(Integer.toBinaryString(-999));

		for (int i = -996; i < 999; i++) {
			if (i % 3 == 0) {
				sbPattern.append("|");
				sbPattern.append("0*");
				sbPattern.append(Integer.toBinaryString(i));
			}
		}

		String pattern = sbPattern.toString();

		System.out.println(pattern);

	}

}
