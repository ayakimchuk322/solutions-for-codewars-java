package ballotscounter;

import java.util.*;

public class BallotsCounter {

    public static String getWinner(final List<String> listOfBallots) {
        //Your code
    	int max = 0;
    	String winner = null;
    	
    	Set<String> setOfBallots = new TreeSet<String>(listOfBallots);
    	for (String s : setOfBallots){
    		max = Collections.frequency(listOfBallots, s);
    		if (max > (listOfBallots.size() / 2)) winner = s;
    	}
    	
    	return winner;
      }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getWinner(Arrays.asList("A", "A", "A", "B", "B", "B", "A")));

	}

}
