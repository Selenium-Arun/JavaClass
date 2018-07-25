package demoJavaClass;

import java.util.Scanner;

//WAP to multiply
//WAP 
public class Session_2 {

	public static void main(String[] args) {
	
		Scanner input =new Scanner(System.in);
					
		System.out.println("Entr your name");
		String name = input.nextLine();
		
		System.out.println("Enter number:");
		int a = input.nextInt();
		
		System.out.println("My age is "+a+ "my name is "+name);
	}
}
