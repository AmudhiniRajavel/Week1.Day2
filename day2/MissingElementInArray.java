package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 6, 9, 7 };
		Arrays.sort(arr);
		System.out.println("Missing Numbers are: ");

		for (int i = 0; i < arr.length - 1; i++) {
			if ((arr[i] + 1) != arr[i + 1])

				System.out.println(arr[i] + 1);

		}
	}
}
