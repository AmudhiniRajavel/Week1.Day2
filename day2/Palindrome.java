package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int input = 34543;
		int temp = input;
		int sum = 0;
		System.out.println(input);

		while (input > 0) {
			int rem = input % 10;
			sum = (sum * 10) + rem;
			input = input / 10;

		}
		if (sum == temp) {
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not a Palindrome Number");
		}
	}

}
