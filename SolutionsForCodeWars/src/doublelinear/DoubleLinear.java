package doublelinear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DoubleLinear {

	public static int dblLinear(int n) {
		// your code
		List<Integer> tempList = new ArrayList<>();

		tempList.add(1);

		for (int i = 0; i <= n; i++) {
			int intTempOne = tempList.get(i);
			int intTempTwo = 2 * intTempOne + 1;
			int intTempThree = 3 * intTempOne + 1;

			if (!tempList.contains(intTempTwo)) {
				tempList.add(intTempTwo);
			}

			if (!tempList.contains(intTempThree)) {
				tempList.add(intTempThree);
			}

			Collections.sort(tempList);
		}

		return tempList.get(n);
	}

	public static void main(String[] args) {

		for (int i = 1; i < 1000; i++) {
			int tempResult = DoubleLinear.dblLinear(i);
			System.out.format("%4d %7d %4d %4d %n", 
					i, tempResult, tempResult / i, tempResult % i);
		}

	}
}
