package java_number_programs;
import java.util.Scanner;

public class Smith_Num {

	static boolean isPrime(int n) {

		if (n <= 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {

			if (n % i == 0)
				return false;
		}
		return true;
	}

	static boolean Smith(int n) {

		// reverse the value
		int temp_1 = n, spread = 0;

		while (temp_1 > 0) {

			spread = temp_1 % 10;
			temp_1 /= 10;
			spread = spread + temp_1;

		}
		
		int temp_2 = n, value, div, digit;

		for (int i = 2; i <= temp_2 / 2; i++) {

			if (isPrime(i) == true) {

				if (temp_2 % i == 0) {

					div = i;
					value = temp_2 / i;
					temp_2 = value;

					digit = value % 10;
					value /= 10;
					digit += value;
					value = 0;

					if (isPrime(temp_2) == true)

						value = div + digit;

					if (spread == value)
						return true;
					else
						return false;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");

		int num = ur.nextInt();
		ur.close();

		if (Smith(num) == true)
			System.out.println(num + " is a smith number");
		else
			System.out.println(num + " is not a smith number");
	}
}