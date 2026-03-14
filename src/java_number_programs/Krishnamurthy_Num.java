package java_number_programs;
import java.util.Scanner;

public class Krishnamurthy_Num {
// also known as strong number

	static int Strong(int n) {

		int temp = n, digit, sum = 0, fact = 1;

		while (temp > 0) {

			digit = temp % 10;

			for (int i = 1; i <= digit; i++) {
				fact *= i;
			}
			
			sum += fact;
			temp /= 10;
			fact = 1;
		}

		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner ur = new Scanner(System.in);
		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();
		
		if(Strong(num) == num)
			System.out.println(num + " is a krishnamurthy (strong) number");
		else
			System.out.println(num + " is not a krishnamurthy (strong) number");
	}
}