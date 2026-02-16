package java_number_programs;
import java.util.Scanner;

public class LargeThreeNum {

	public static int largeNum(int num1, int num2, int num3) {

		if ((num1 > num2) && (num1 > num3))
			return num1;

		else if ((num2 > num1) && (num2 > num3))
			return num2;
		else
			return num3;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter 1st value : ");
		int num1 = ur.nextInt();

		System.out.print("enter 2nd value : ");
		int num2 = ur.nextInt();

		System.out.print("enetr 3rd value : ");
		int num3 = ur.nextInt();

		ur.close();

		System.out.println("Largest Number is : " + largeNum(num1, num2, num3));
	}
}