package daysix;

import java.util.Scanner;

/*
 * public
 * private *only accessed with in the class*
 * protected *Only accessed with in the package*
 * default(No Modifier) *Only accessed with in the package*
 * */

public class AccessModiferDemo {
	int x = 10;
	int y = 20;
	String name = "Java Class";
	
	public static void main(String[] args) {
		arrayinput();
	}
	
	public static void sum() {
		int c = 2+5;
		System.out.println(c);
	}
	
	public static void arrayinput() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter no of elements");
		int n = in.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter elements:");
		
		for (int i=0; i<n;i++) {
			arr[i] = in.nextInt();
		}
		
		
		for (int a:arr) {
			System.out.println(a);
		}
		
		in.close();
		
		
	}
	
	
	}
			


 