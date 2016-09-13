package pyramidslidedown;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ReadPyramidFromFile {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		RandomAccessFile pyramidIn = null;

		List<String> pyramidLines = new ArrayList<>();

		String file = null;
		String line = null;

		file = in.readLine();

		pyramidIn = new RandomAccessFile(file, "r");

		while (!((line = pyramidIn.readLine()) == null)) {
			pyramidLines.add(line);
		}

		pyramidIn.close();

		int[][] pyramidArray = new int[pyramidLines.size()][];

		for (int i = 0; i < pyramidArray.length; i++) {
			String[] tempStringArray = pyramidLines.get(i).split(" ");
			int[] tempIntArray = new int[tempStringArray.length];

			for (int j = 0; j < tempIntArray.length; j++) {
				tempIntArray[j] = Integer.parseInt(tempStringArray[j]);
			}

			pyramidArray[i] = tempIntArray;
		}

		System.out.println(LongestSlideDown.longestSlideDown(pyramidArray));

	}

}
