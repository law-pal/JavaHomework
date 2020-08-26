package firstJavaProject;

import java.util.Scanner;

public class UnitConvertion {
	public static void convertion(double inch) {
		double meter = 0.0254;
		double solution = inch * meter;
		System.out.println(solution);
		
	}
	public static void main(String[] args) {
		System.out.println("Insert a value in inches ? ");
		Scanner convertUnit = new Scanner(System.in);
		double inch = convertUnit.nextDouble();
		convertion(inch);
	}
}
