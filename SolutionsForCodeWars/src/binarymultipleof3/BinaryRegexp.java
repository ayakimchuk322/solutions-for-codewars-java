package binarymultipleof3;

import java.util.regex.Pattern;

public class BinaryRegexp {

	public static Pattern multipleOf3() {
		// Regular expression that matches binary inputs that are multiple of 3

		return Pattern.compile("(1(01*0)*1|0)*");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
