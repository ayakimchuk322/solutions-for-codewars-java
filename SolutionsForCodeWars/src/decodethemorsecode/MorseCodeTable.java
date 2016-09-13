package decodethemorsecode;

import java.util.HashMap;

public final class MorseCodeTable {

	private HashMap<String, String> MorseCode = new HashMap<>();
	
	private static MorseCodeTable table;
	
	private MorseCodeTable() {
		MorseCode.put(".-", "A");
		MorseCode.put("-...", "B");
		MorseCode.put("-.-.", "C");
		MorseCode.put("-..", "D");
		MorseCode.put(".", "E");
		MorseCode.put("..-.", "F");
		MorseCode.put("--.", "G");
		MorseCode.put("....", "H");
		MorseCode.put("..", "I");
		MorseCode.put(".---", "J");
		MorseCode.put("-.-", "K");
		MorseCode.put(".-..", "L");
		MorseCode.put("--", "M");
		MorseCode.put("-.", "N");
		MorseCode.put("---", "O");
		MorseCode.put(".--.", "P");
		MorseCode.put("--.-", "Q");
		MorseCode.put(".-.", "R");
		MorseCode.put("...", "S");
		MorseCode.put("-", "T");
		MorseCode.put("..-", "U");
		MorseCode.put("...-", "V");
		MorseCode.put(".--", "W");
		MorseCode.put("-..-", "X");
		MorseCode.put("-.--", "Y");
		MorseCode.put("--..", "Z");
		MorseCode.put("...---...", "SOS");
	}
	
	public static MorseCodeTable getTable() {
		if (table == null) {
			table =  new MorseCodeTable();
			return table;
		} else {
			return table;
		}
	}
	
	public String getFromTable(String key) {
		return table.MorseCode.get(key);
	}
}
