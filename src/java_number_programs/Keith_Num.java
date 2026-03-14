package java_number_programs;

import java.util.Scanner;

public class Keith_Num {

	static boolean keith(int i) {

		int temp = i, s1, s2, s3, sum;

		s3 = temp % 10;
		temp /= 10;
		s2 = temp % 10;
		temp /= 10;
		s1 = temp % 10;

		temp = s1 + s2 + s3;

		while (temp < i) {

			sum = s1 + s2 + s3;

			s1 = s2;
			s2 = s3;
			s3 = sum;

			temp = sum; // 742 ---> 7 + 4 + 2 = 13 = 19 = 34 = 66 = 119 = 219 = 404 = 742
		}

		return temp == i;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");
		int value = ur.nextInt();
		ur.close();

		if (keith(value) == true)
			System.out.println(value + " is a keith value");
		else
			System.out.println(value + " is not a keith value");
	}
}