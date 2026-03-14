package java_number_programs;
import java.util.Scanner;

public class neon_num {

	static boolean neon(int n) {

		int square = n * n;
		int sum = 0;

		while (square > 0) {
			sum += square % 10;
			square /= 10;
		}

		if (sum == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();

		if (neon(num) == true)
			System.out.println(num + " is a neon value");
		else
			System.out.println(num + " is not a neon value");
	}
}