// A simple calculator
import java.util.*;
class Calculator{
	public static void main(String[] array){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two operands:");
		float a = in.nextFloat();
		float b = in.nextFloat();

		in.nextLine();
		System.out.println("Enter operation:");
		char c = in.nextLine().charAt(0);

		switch(c){
			case '+':
			System.out.println(a + " " + b + " = " + (a+b));
			break;
			case '-':
			System.out.println(a + " " + b + " = " + (a-b));
			break;
			case '*':
			System.out.println(a + " " + b + " = " + (a*b));
			break;
			case '/':
			System.out.println(a + " " + b + " = " + (a/b));
				break;

			default:
			System.out.println("Error! Incorrect operation.");
		}
	}
}