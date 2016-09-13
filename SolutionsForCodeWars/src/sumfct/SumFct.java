package sumfct;

import java.math.BigInteger;
import static java.math.BigInteger.*;

public class SumFct
{
	
	public static BigInteger perimeter(BigInteger n)
	{
		// your code
		BigInteger prev = valueOf(1);
		BigInteger prevprev = valueOf(0);
		BigInteger current = valueOf(0);
		BigInteger sum = valueOf(1);
		BigInteger perimeter = valueOf(0);
		
		for (long i = 0; i < n.intValue(); i++)
		{
			current = prev.add(prevprev);
			prevprev = prev;
			prev = current;
			sum = sum.add(current);
		}
		
		perimeter = sum.multiply(valueOf(4));
		
		return perimeter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
