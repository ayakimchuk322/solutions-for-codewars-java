package pentanacci;
import java.math.BigInteger;
import java.util.*;

public class Pentanacci {

    public static long countOddPentaFib(long n) {
        // your code
    	BigInteger temp = new BigInteger("0");
    	long count = 0;
    	
    	
    	List<BigInteger> pentafib = new ArrayList<BigInteger>();
    		pentafib.add(BigInteger.valueOf(0));
	    	pentafib.add(BigInteger.valueOf(1));
	    	pentafib.add(BigInteger.valueOf(1));
	    	pentafib.add(BigInteger.valueOf(2));
	    	pentafib.add(BigInteger.valueOf(4));
	    	
    	switch ((int)n){
    	case 0: return 0;
    	case 1:
    	case 2:
    	case 3:
    	case 4: return 1;
    	default:
	    	for (int i = 0; i < n - 5; i++){
	    		for (int j = 0; j < 5; j++){
	    			try{
	    				temp = temp.add(pentafib.get(pentafib.size() - 1 - j));
	    			} catch (IndexOutOfBoundsException ex){
	    			
	    			}
	    		}
	    		pentafib.add(temp);
	    		temp = BigInteger.ZERO;
	    	}
	    	
	    	System.out.println(pentafib);
	    	
			for (BigInteger t : pentafib) {
				if ((t.remainder(BigInteger.valueOf(2))) != BigInteger.ZERO){
					count++;
				}
			}
	    	
	    	return --count;
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countOddPentaFib(100));

	}

}
