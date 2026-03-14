package java_number_programs;
import java.util.Scanner;

public class Peterson_Num {

	static boolean peterson(int n) {
		
		int digit = n;
		int refer = 0;

		while (n > 0) {

			int value = n % 10;
			int sum = 1;

			for (int i = 1; i <= value; i++) {

				sum = sum * i;

			}

			refer = refer + sum;
			n /= 10;

		}

		if (refer == digit) {
			return true;

		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();

		if (peterson(num) == true) {
			System.out.println(num + " is a Peterson number");
		} else {
			System.out.println(num + " is not a Peterson number");
		}
	}
}