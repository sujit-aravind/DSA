package java_number_programs;

import java.util.Scanner;

public class Sunny_Num {

	static boolean sunny(int n) {

		int num = n + 1;
		
		System.out.println("added +1 to check : " + num);

		for (int i = 1; i * i <= num; i++) {
			if (i * i == num) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");
		int n = ur.nextInt();
		ur.close();

		if (sunny(n) == true)
			System.out.println(n + " is a sunny value");
		else
			System.out.println(n + " is not a sunny value");
	}
}