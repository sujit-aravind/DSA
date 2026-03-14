package java_number_programs;
import java.util.Scanner;

public class positiveORnegative {

	public static void positiveNegative(int num) {

		if (num > 0)
			System.out.println(num + " is a positive number");
		else if (num < 0)
			System.out.println(num + " is a negative number");
		else
			System.out.println(num + " is zero");
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");
		int value = ur.nextInt();
		ur.close();

		positiveORnegative.positiveNegative(value);
	}
}