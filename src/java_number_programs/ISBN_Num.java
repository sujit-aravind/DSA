package java_number_programs;
import java.util.Scanner;

public class ISBN_Num {

	static boolean ISBN(int n) {

		int temp = n, sum = 0, value;

		while (temp > 0) {

			value = temp % 10;

			for (int i = 10; i >= temp; i--) {

				sum = sum + (i * value);
			}

			temp /= 10;

		}

		if (sum % 11 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		
		Scanner ur = new Scanner(System.in);
		
		System.out.print("enter value : " );
		int num = ur.nextInt();
		ur.close();
		
		if(ISBN(num) == true)
			System.out.println(num + " is a ISBN value");
		else
			System.out.println(num + " is not a ISBN value");
	}
}