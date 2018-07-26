package daythree;

import java.util.Scanner;

public class IfElseDemo {
	
	/*if(expression){
	 * statement
	 * }
	 * 
	 * WAP to find the grade of student if marks > 80 "grade 'A+' mark >= 60 grade =A less than 60 ande greate > 50 B 
	 * greater than 40 less 50 grade c less than 40 then fail
	 * 
	 * 
	 * if 
	 * if else
	 * if elseif else
	 * nested if
	 * 
	 * */
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age of child: ");
		int age = sc.nextInt() ; 
		
		if(age > 5) {
			System.out.println("will took admission in class 1");
		}else if ( age > 3) {
			System.out.println(" will go to play scool ");
		}else {
			System.out.println("should rest at home now");
		}
		
		System.out.println("This code is always there");

	}

}
