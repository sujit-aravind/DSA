package java_number_programs;

import java.util.Scanner;

public class XylemPhloem {

	public static boolean findXylemPhloem(int n) {

		int temp = n, extreme_sum = 0, mean_sum = 0, count = 0;

		while (temp > 0) {

			count++;
			temp /= 10;
		}
		
		temp = n;
		
		for (int i = count; i > 0; i--) {
			
			if((i == count) || (i == 1)) {
				
				extreme_sum = (extreme_sum + (temp % 10));
				temp /= 10;
			}
			else {
				
				mean_sum = (mean_sum + (temp % 10));
				temp /= 10;	
			}
		}
		
		if(extreme_sum == mean_sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);
		
		System.out.print("enter value : ");
		int num = ur.nextInt();
		
		if(findXylemPhloem(num) == true)
			System.out.println(num + " is a Xylem number");
		else
			System.out.println(num + " is a Phloem number");
	}
}