package week1.day2;

import java.util.Arrays;

public class PrintDuplicateValues {

	public static void main(String[] args) {
		int[] data = { 11, 15, 17, 19, 12, 11, 13, 11, 15, 12, 14 };
		Arrays.sort(data);

		for (int i = 0; i < data.length - 1; i++) {

			if (data[i] == data[i + 1]) {

				System.out.println(data[i]);
			}

		}

	}

}
