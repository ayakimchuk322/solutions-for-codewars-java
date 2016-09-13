package catchingcarmileagenumbers;

public class CarMileageMyTest {

	public static void main(String[] args) {
		
		System.out.println(CarMileage.isInteresting(100, new int[]{1337, 256}) + " should be: 2");
		System.out.println(CarMileage.isInteresting(1111, new int[]{1337, 256}) + " should be: 2");
		System.out.println(CarMileage.isInteresting(1234, new int[]{1337, 256}) + " should be: 2");
		System.out.println(CarMileage.isInteresting(4321, new int[]{1337, 256}) + " should be: 2");
		System.out.println(CarMileage.isInteresting(7890, new int[]{1337, 256}) + " should be: 2");
		System.out.println(CarMileage.isInteresting(543210, new int[]{1337, 256}) + " should be: 2");
		System.out.println(CarMileage.isInteresting(23432, new int[]{1337, 256}) + " should be: 2");
		System.out.println(CarMileage.isInteresting(4554, new int[]{1337, 256}) + " should be: 2");
		System.out.println(CarMileage.isInteresting(99, new int[]{1337, 256}) + " should be: 1");
		System.out.println(CarMileage.isInteresting(98, new int[]{1337, 256}) + " should be: 1");
		System.out.println(CarMileage.isInteresting(97, new int[]{1337, 256}) + " should be: 0");
	}

}
