package packagetwo;

import daysix.AccessModiferDemo;

public class ForEach {

	public static void main(String[] args) {
		
		AccessModiferDemo obj = new AccessModiferDemo();
		obj.sum();

		int n = 0;
		long fact = 1;

		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println(fact);
	}

}
