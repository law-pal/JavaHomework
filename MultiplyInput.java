package firstJavaProject;

import java.util.Scanner;

public class MultiplyInput {
	public static double Input(double input1, double input2) {
		double result = input1 * input2;
		System.out.println(result);
		return result;
	}
	public static void main(String[] args) {
		System.out.println("What's your first input");

		Scanner typeInput = new Scanner(System.in);
		
		double input1 = typeInput.nextDouble();
		
		System.out.println("What's your second input");
		
		double input2 = typeInput.nextDouble();
		
		double answer = Input(input1, input2);
		
		System.out.println("You result is equal to " + answer);
		
		
	}
}
