package week1.day2;

import java.util.Arrays;

public class SecondSmallestInArray {

	public static void main(String[] args) {
		int[] arr = { 11, 33, 57, 17, 22, 46, 61, 8 };
		Arrays.sort(arr); 
		System.out.println("The Second Smallest Number is:" + arr[1]);

	}

}
