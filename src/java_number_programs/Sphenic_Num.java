package java_number_programs;
import java.util.Scanner;

public class Sphenic_Num {

	static boolean prime(int n) {

		if (n <= 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	static boolean sphenic(int num) {

		int temp = num;
		int count = 0;

		for (int i = 2; i <= temp; i++) {

			if (prime(i) && temp % i == 0) {

				count++;
				temp = temp / i;

				if (temp % i == 0)
					return false;
			}
		}

		return count == 3 && temp == 1;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);
		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();

		if (sphenic(num))
			System.out.println(num + " is a Sphenic number");
		else
			System.out.println(num + " is not a Sphenic number");
	}
}
