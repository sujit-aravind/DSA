package java_number_programs;
import java.util.Scanner;

public class Prime_Num {

	public static boolean isPrime(int n) {

		int temp = n, count = 0;

		if (temp <= 1)
			return false;

		for (int i = 2; i < temp / 2; i++) {

			if (temp % i == 0)
				return false;
		}

		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner ur = new Scanner(System.in);
		
		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();
		
		if(isPrime(num))
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
}