package daythree;

public class SwitchCaseDemo {

	/*
	 * switch(expression){ statement statement
	 */

	public static void main(String[] args) {

		//int a = 3;
		
		char  val = 'a';

		switch (val) {

		case 'A':
		case 'a':
			System.out.println("Value of a is A");
			break;
		case 'B':
		case 'b':
			System.out.println("value of a is B");
			break;
		case 'C':
		case 'c':
			System.out.println("Value of a is C");
			break;
		
		case 'D':
		case 'd':
			System.out.println("Value of a is D");
			break;

		default:
			System.out.println("Invalid entry");
			break;
		}

	}

}
