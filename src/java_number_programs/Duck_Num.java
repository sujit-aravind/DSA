package java_number_programs;
import java.util.Scanner;

public class Duck_Num {

	static boolean duck(int n) {

		int value;
		boolean isFlag = false;

		while (n > 0) {

			value = n % 10;
			n = n / 10;
			if (value == 0)
				isFlag = true;
			else if (value != 0)
				value = 0;
			else if (n == 0)
				isFlag = false;
		}
		
//		int num, digit, n2 = n, temp;
//		
//		while (n2 > 0) {
//
//			temp= n2 % 10;
		    
//		   num = (num * 10) + temp;
//
//			n2 /= 10;
//
//			if (n2 == 0) {
//
//				digit = num % 10;
//
//				if (digit == 0)
//					isFlag = false;
//				else
//					isFlag = true;
//			}
//		}

		if (isFlag == true)
			return isFlag;
		else
			return isFlag;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);
		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();

		if (duck(num) == true)
			System.out.println(num + " is a duck value");
		else
			System.out.println(num + " is not a duck value");
	}
}