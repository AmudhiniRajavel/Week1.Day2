package week1.day2;

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public double sub(double c, double d) {
		return c - d;
	}

	public double mul(double e, double f) {
		return e * f;
	}

	public int div(int g, int h) {
		return g / h;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		int add = calc.add(10, 20);
		System.out.println("Addition Value is:" + add);
		double sub = calc.sub(20.445, 10.4566);
		System.out.println("Subtraction Value is:" + sub);
		double mul = calc.mul(10.4566, 20.00988);
		System.out.println("Multiplication Value is:" + mul);
		int div = calc.div(20, 10);
		System.out.println("Division Value is:" + div);
	}

}
