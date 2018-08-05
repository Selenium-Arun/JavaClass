package packageone;

import java.util.Scanner;

public class Algorithms {

	public static void main(String[] args) {
		findnum();
	}

	public static void findnum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter number in Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("==============================\n");

		System.out.println("Enter number to search ");
		int key = sc.nextInt();

		for (int j = 0; j < n; j++) {
			if (arr[j] == key) {
				System.out.println("Element found at position" + j);
				break;
			}else {
				System.out.println("Element not found");
			}

		}
		

	}
}
