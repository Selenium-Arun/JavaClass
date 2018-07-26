package daythree;

public class NestedIf {

	public static void main(String[] args) {

		int num = 78;

		if (num < 100) {

			if (num > 80) {
				System.out.println("number is greate than 80 and less than 100");
			}else {
				System.out.println(" number isless than 100");
			}

		} else {
			System.out.println("invalid number");
		}

	}

}
