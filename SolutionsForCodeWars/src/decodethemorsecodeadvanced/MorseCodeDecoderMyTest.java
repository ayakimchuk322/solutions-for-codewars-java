package decodethemorsecodeadvanced;

public class MorseCodeDecoderMyTest {

	public static void main(String[] args) {

		String morseCode = "";
		
		morseCode = MorseCodeDecoder.decodeBits(
				"000000011001100110011000000110000001111110011001111110011111100000000000000110011111100111111001111110000001100110011111100000011111100110011000000110");
		System.out.println(morseCode);
		System.out.println(MorseCodeDecoder.decodeMorse(morseCode));

		morseCode = MorseCodeDecoder.decodeBits("110011");
		System.out.println(morseCode);
		System.out.println(MorseCodeDecoder.decodeMorse(morseCode));

	}

}
