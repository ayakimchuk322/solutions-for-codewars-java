package josephuspermutation;

import java.util.ArrayList;
import java.util.List;

public class Josephus {

	public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
		List<T> permutation = new ArrayList<T>();
		int position = 0;
		while(items.size() > 0) {
			position = (position + k - 1) % items.size();
			permutation.add(items.remove(position));
		}
		return permutation;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
