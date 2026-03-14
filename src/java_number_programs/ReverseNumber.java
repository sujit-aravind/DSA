package java_number_programs;
public class ReverseNumber {
	public static void main(String[] args) {
		
		int num = 1234, rev = 0;
		
		while (num != 0) {
			
			int value = num % 10;
			
			rev = ( rev * 10 ) + value;
			
			num = num / 10;
			
		}
		
		System.out.println("reverse value :  " + rev);
		
	}
}