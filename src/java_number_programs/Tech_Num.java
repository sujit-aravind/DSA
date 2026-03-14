package java_number_programs;
import java.util.Scanner;

public class Tech_Num {
	static boolean Techies(int n) {
		int temp = n, value_1, value_2, sum;
		value_1 = temp % 100;
		temp = temp / 100;
		value_2 = temp % 100;
		System.out.println("splict value is : " + value_1 + ", " + value_2);
		sum = value_1 + value_2;
		sum = sum * sum;
		if (sum == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner ur = new Scanner(System.in);
		System.out.print("enter value : ");
		int num = ur.nextInt(), temp = num, count = 0;
		ur.close();
		
		while(temp > 0) {
			temp = temp / 10;
			count++;
		}
		
		if( count == 4 ) {
			
			if (Techies(num) == true)
				System.out.println(num + " is a tech number");
			else
				System.out.println(num + " is not a tech number");
			
		}
		else
			System.out.println("invalid number");
	}
}