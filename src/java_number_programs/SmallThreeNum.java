package java_number_programs;
import java.util.Scanner;

public class SmallThreeNum {

	public static int smallNum(int i1, int i2, int i3) {

		if ((i1 < i2) && (i1 < i3))
			return i1;

		else if ((i2 < i1) && (i2 < i3))
			return i2;

		else
			return i3;
	}
	
	public static void main(String[] args) {
		
		Scanner ur = new Scanner(System.in);
		
		System.out.print("enter 1st value : ");
		int num1 = ur.nextInt();
		System.out.print("enter 2nd value : ");
		int num2 = ur.nextInt();
		System.out.print("enter 3rd value : ");
		int num3 = ur.nextInt();
		
		ur.close();
		
		System.out.println("smallest number is : " + smallNum(num1, num2, num3));
		
	}
}