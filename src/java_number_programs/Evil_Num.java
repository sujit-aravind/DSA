package java_number_programs;
import java.util.Scanner;

public class Evil_Num {
	
	static boolean evil(int n) {
		
		int temp = n,rem = 0, count = 0;
		
		while(temp > 0) {
			
			rem = temp % 2;
			
			if(rem == 1)
				count++;
			
			temp /= 2;
		}
		
		if(count % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		Scanner ur = new Scanner(System.in);
		
		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();
		
		if(evil(num) == true)
			System.out.println(num + " is an evil number");
		else
			System.out.println(num + " is an odious number");
	}
}