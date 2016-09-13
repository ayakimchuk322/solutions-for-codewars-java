package decodethemorsecode;

import static decodethemorsecode.MorseCodeTable.getTable;

import decodethemorsecode.MorseCodeTable;

public class MorseCode {

	public static String get(String morseCode) {

		MorseCodeTable table = getTable();

		return table.getFromTable(morseCode);
	}
}