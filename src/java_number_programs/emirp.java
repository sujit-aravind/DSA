package java_number_programs;

import java.util.Scanner;

public class emirp {

	static boolean isPrime(int n) {

		boolean isFlag;

		if (n <= 1)
			return isFlag = false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return isFlag = false;
		}
		return isFlag = true;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);
		System.out.print("enter value : ");
		int value = ur.nextInt();
		ur.close();

		if (isPrime(value) == true) {

			if (isPrime(value)) {

				int temp = value, rev = 0;

				while (temp > 0) {
					int d = temp % 10;
					rev = rev * 10 + d;
					temp /= 10;
				}

				if (rev != value && isPrime(rev))
					System.out.println(value + " is an emirp number");
				else
					System.out.println(value + " is not an emirp number");

			} else {
				System.out.println(value + " is not an emirp number");
			}
		}
	}
}