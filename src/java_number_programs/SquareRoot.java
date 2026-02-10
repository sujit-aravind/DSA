package java_number_programs;

import java.util.Scanner;

public class SquareRoot {
	
	public static double squareRoot(int n) {
		
		double temp;
		double half = n/2.0;
		
		do {
			
			temp = half;
			half = (temp + n/temp)/2;
			
		} while ((temp-half)!= 0);
			return half;
	}
	
	public static void main(String[] args) {
		
		Scanner ur = new Scanner(System.in);
		
		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();
		
		System.out.println("the square root of " + num + " is : " + squareRoot(num));
	}
}