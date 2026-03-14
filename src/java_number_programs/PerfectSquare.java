package java_number_programs;
import java.util.Scanner;

public class PerfectSquare {
	
	public static boolean isSquare(int num) {
		
		for (int i = 1; i*i <= num; i++) {
			
			if((num % i == 0) && (num / i == i))
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner ur = new Scanner(System.in);
		
		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();
		
		if(isSquare(num) == true)
			System.out.println(num + " is a square number");
		else
			System.out.println(num + " is not a square number");
	}
}