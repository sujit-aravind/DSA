package java_number_programs;
import java.util.Scanner;

public class BitWise_Operator {
	
	public static void bitWise(int x, int y) {
		
		System.out.println("before swapping X and Y : " + x +  " : " + y);
		
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		System.out.println("after swapping X and Y : " + x +  " : " + y);
		
	}
	
	public static void main(String[] args) {
		
		Scanner ur = new Scanner(System.in);
		
		System.out.print("enter first digit value : ");
		int first = ur.nextInt();
		System.out.print("enter second dight value : ");
		int second = ur.nextInt();
		ur.close();
			
		BitWise_Operator.bitWise(first, second);
		
	}

}