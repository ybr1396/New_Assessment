package today_Assessment;

import java.util.Scanner;

public class Exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Input a value for inch: ");
		double inch = input.nextDouble();
		double meters = inch * 0.0254;
		System.out.println(inch + " inch is " + meters + " meters");
		input.close();
	}
}
