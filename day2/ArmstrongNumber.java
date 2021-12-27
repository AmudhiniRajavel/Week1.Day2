package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int input = 153;
		int orgNum = input;
		int sum = 0;
		System.out.println(input);

		while(input>0) {
		int rem = input %10;
		sum = sum + (rem*rem*rem);
		input = input/10;
		
		}
		
		if(sum == orgNum)
		{
			System.out.println("It is a Armstong Number");

		}
		else {
		System.out.println("It is not a Armstrong Number");
		}
		



	
	}

}
