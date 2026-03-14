package java_number_programs;
public class NaturalNum {

	public static void main(String[] args) {

		int i, num = 10, sum = 0;
		
		for (i = 1; i <= num; i++) {
			
			
			sum += i;
		}
		
		System.out.println("Sum of first 10 Natural Number is : " + sum);
	}
}