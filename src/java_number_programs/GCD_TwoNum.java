package java_number_programs;
import java.util.Scanner;

public class GCD_TwoNum {

	public static int gcdTwoNum(int x, int y) {
		
		int temp;
		
		while(y != 0) {
			
			temp = x % y;
			
			x = y;
			y = temp;
		}
		
		return x;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter first value : ");
		int first = ur.nextInt();
		System.out.print("enter second value : ");
		int second = ur.nextInt();
		ur.close();
		
		System.out.println("Greatest Common Divisor is " + GCD_TwoNum.gcdTwoNum(first, second));
	}
}