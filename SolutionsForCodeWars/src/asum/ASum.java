package asum;

public class ASum {

	public static long findNb(long m) {
		// your code
		long sum = 0;
		long count = 0;
		
		for (long i = 1; ;i++){
			sum += (long) Math.pow(i, 3);
			count++;
			
			if (sum == m) return count;
				else if (sum < m) continue;
					else return -1;
		}
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findNb(91716553919377L));

	}

}
