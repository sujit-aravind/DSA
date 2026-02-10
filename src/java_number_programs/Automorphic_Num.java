package java_number_programs;
import java.util.Scanner;

public class Automorphic_Num {
	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");
		int n = ur.nextInt();
		ur.close();

		if (Automorphic(n) == true)

			System.out.println(n + " is a automorphic");
		else
			System.out.println(n + " is not a automorphic");
	}

	static boolean Automorphic(int num) {

		int value = num * num;

		while (num > 0) {

			if (num % 10 != value % 10)
				return false;

			num /= 10;
			value /= 10;
		}
		return true;

	}
}