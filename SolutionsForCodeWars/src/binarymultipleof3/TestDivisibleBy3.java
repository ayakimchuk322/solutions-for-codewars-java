package binarymultipleof3;

public class TestDivisibleBy3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 1000; i++) {
			String binary = Integer.toBinaryString(i);
			boolean divisible = (i % 3 == 0) ? true : false;
			if (divisible) {
				System.out.printf("%3d %16s %n", i, binary);
			}
			//System.out.printf("%3d %8s %b %n", i, binary, divisible);
		}
	}

}
