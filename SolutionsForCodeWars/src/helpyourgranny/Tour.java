package helpyourgranny;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Map;

public class Tour {

	public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
		// your code
		
		double distance = 0.0;

		ArrayList<String> townsInOrder = new ArrayList<>();

		for (int i = 0; i < arrFriends.length; i++) {
			for (int j = 0; j < ftwns.length; j++) {
				if (arrFriends[i].equals(ftwns[j][0])) {
					townsInOrder.add(ftwns[j][1]);
					break;
				}
			}
		}

		distance += h.get(townsInOrder.get(0));
		distance += h.get(townsInOrder.get(townsInOrder.size() - 1));

		for (int i = 1; i < townsInOrder.size(); i++) {
			double tempDist;
			double a;
			double b;

			a = h.get(townsInOrder.get(i - 1));
			b = h.get(townsInOrder.get(i));

			tempDist = Math.sqrt(b * b - a * a);

			distance += tempDist;
		}

		BigDecimal bgdistance = new BigDecimal(distance);
		
		bgdistance.round(new MathContext(2, RoundingMode.FLOOR));

		return (int) bgdistance.intValue();
	}
}
