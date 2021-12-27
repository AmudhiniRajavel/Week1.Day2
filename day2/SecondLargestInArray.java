package week1.day2;

import java.util.Arrays;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int[] num = {3,2,11,4,6,7};
		Arrays.sort(num); //2,3,4,6,7,11
		int secLar = num.length-2;
		
		System.out.println(num[secLar]);

	}
		

}
