package week1.day2;

public class ConvertNegToPosNum {

	public static void main(String[] args) {
		int i = -45;

		if (i < 0) {
			System.out.println(i + " is a Negative Number");
		} else {
			System.out.println(i + " is a Positive Number");
		}

		int sum = i * -1;
		if (sum < 0) {
			System.out.println(sum + " is the negative number of " + i);
		} else {
			System.out.println(sum + " is the positive number of " + i);
		}

	}

}
