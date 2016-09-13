package pentanacci;
import java.util.*;

public class Pentanacci3 {

    public static long countOddPentaFib(long n) {
        // your code
    	long temp = 0;
    	long count = 0;
    	
    	
    	List<Long> pentafib = new ArrayList<Long>();
    		pentafib.add(0L);
	    	pentafib.add(1L);
	    	pentafib.add(1L);
	    	pentafib.add(2L);
	    	pentafib.add(4L);
	    	
    	switch ((int)n){
    	case 0: return 0;
    	case 1:
    	case 2:
    	case 3:
    	case 4: return 1;
    	default:
	    	for (int i = 0; i < n - 4; i++){ //should always pay attention to the fact arrays start with 0 index
	    		for (int j = 0; j < 5; j++){
	    			try{
	    				temp += pentafib.get(pentafib.size() - 1 - j);
	    			} catch (IndexOutOfBoundsException ex){
	    			
	    			}
	    		}
	    		pentafib.add(temp);
	    		temp = 0;
	    	}
	    	
	    	System.out.println(pentafib);
	    	
			for (Long t : pentafib) {
				if ((t % 2) != 0){
					count++;
				}
			}
	    	
	    	return --count;
    	}
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countOddPentaFib(10000));

	}

}
