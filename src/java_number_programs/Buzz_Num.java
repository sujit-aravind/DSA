package java_number_programs;
import java.util.Scanner;

class Buzz_Num {

	static boolean buzz(int n) {
		
		int last_digit;
		boolean isFlag = false;

		last_digit = n % 10;

		if (last_digit == 7)
			isFlag = true;

		else if (n % 7 == 0)
			isFlag = true;

		if (isFlag == true)
			return isFlag;
		else
			return isFlag;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");
		int value = ur.nextInt();
		ur.close();

		if (buzz(value) == true)
			System.out.println(value + " is a buzz value");
		else
			System.out.println(value + " is not a buzz value");
	}
}