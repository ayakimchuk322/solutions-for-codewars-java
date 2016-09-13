package pentanacci;

public class Pentanacci5 {

    public static long countOddPentaFib(long n) {
        // your code
    	return (long)((n - 1) / 6) + (long)((n - 2) / 6) + 1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countOddPentaFib(45));
		System.out.println(countOddPentaFib(68));
		System.out.println(countOddPentaFib(76));
		System.out.println(countOddPentaFib(100));
		System.out.println(countOddPentaFib(500));

	}

}
