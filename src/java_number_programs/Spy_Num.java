package java_number_programs;
import java.util.Scanner;

public class Spy_Num {

	static boolean spy(int n) {

		int temp_1 = n, temp_2 = n, sum_1 = 0, sum_2 = 1;

		while (temp_1 > 0) {

			sum_1 = sum_1 + (temp_1 % 10);
			temp_1 /= 10;

		}

		while (temp_2 > 0) {

			sum_2 = sum_2 * (temp_2 % 10);
			temp_2 /= 10;

		}

		if (sum_1 == sum_2)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");
		int n = ur.nextInt();
		ur.close();

		if (spy(n) == true)
			System.out.println(n + " is a spy number");
		else
			System.out.println(n + " is not a spy number");
	}
}