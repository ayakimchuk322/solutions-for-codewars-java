package primenumberdecomposer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class PrimeNumberDecomposer
{
	
	public static Long[] getAllPrimeFactors(long n)
	{
		//special cases, 0, 1, 2
		if (n == 0) return new Long[]{};
		if (n == 1) return new Long[]{1L};
		if (n == 2) return new Long[]{2L};
		
		//general case, n > 2
		ArrayList<Long> temp = new ArrayList<>();
		
		long m = n; //temporary variable for for-loop
		
		for (long i = 2; i <= m; i++)
		{
			if (m % i == 0)
			{
				temp.add(i);
				m /= i;
				i--;
			}
		}
		
		//creating and populating array
		Long[] result = new Long[temp.size()];
		
		for (int i = 0; i < temp.size(); i++)
		{
			result[i] = temp.get(i);
		}
		
		return result;
	}
	
	
	
	public static Long[][] getUniquePrimeFactorsWithCount(long n)
	{
		//special cases, 0, 1, 2
		if (n == 0) return new Long[][]{{}, {}};
		if (n == 1) return new Long[][]{{1L}, {1L}};
		if (n == 2) return new Long[][]{{2L}, {2L}};
		
		//general case, n > 2
		ArrayList<Long> templist = new ArrayList<>();
		TreeSet<Long> tempset = new TreeSet<>();	//for removing duplicates
		ArrayList<Long> templistunique = new ArrayList<>();
		
		long m = n; //temporary variable for for-loop
		
		for (long i = 2; i <= m; i++)
		{
			if (m % i == 0)
			{
				templist.add(i);
				m /= i;
				i--;
			}
		}
		
		tempset.addAll(templist);	//removing duplicates
		templistunique.addAll(tempset);	//"casting" back to List, so we can populate array
		
		//creating and populating array
		Long[][] result = new Long[2][templistunique.size()];
		
		for (int i = 0; i < templistunique.size(); i++)
		{
			result[0][i] = templistunique.get(i);
			result[1][i] = (long) Collections.frequency(templist, templistunique.get(i));
		}
		
		return result;
	}
	
	
	
	public static Long[] getPrimeFactorPotencies(long n)
	{
		//special cases, 0, 1, 2
		if (n == 0) return new Long[]{};
		if (n == 1) return new Long[]{1L};
		if (n == 2) return new Long[]{2L};
		
		//general case, n > 2
		ArrayList<Long> templist = new ArrayList<>();
		TreeSet<Long> tempset = new TreeSet<>();	//for removing duplicates
		ArrayList<Long> templistunique = new ArrayList<>();
		
		long m = n; //temporary variable for for-loop
		
		for (long i = 2; i <= m; i++)
		{
			if (m % i == 0)
			{
				templist.add(i);
				m /= i;
				i--;
			}
		}
		
		tempset.addAll(templist);	//removing duplicates
		templistunique.addAll(tempset);	//"casting" back to List, so we can populate array
		
		//creating and populating array
		Long[] result = new Long[templistunique.size()];
		
		for (int i = 0; i < templistunique.size(); i++)
		{
			result[i] = (long) Math.pow(templistunique.get(i), 
					Collections.frequency(templist, templistunique.get(i)));
		}
		
		return result;
	}

	
	
	
	public static void main(String[] args)//for testing
	{
		Long[] test = getAllPrimeFactors(1096);
		
		System.out.println(Arrays.deepToString(test));
		
		Long[][] test2 = getUniquePrimeFactorsWithCount(1096);
		
		System.out.println(Arrays.deepToString(test2));
		
		Long[] test3 = getPrimeFactorPotencies(1096);
		
		System.out.println(Arrays.deepToString(test3));

	}

}
