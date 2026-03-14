package java_number_programs;

public class DisplayEvenNum {

	public static void main(String[] args) {

		System.out.println("even numbers are");
		
		int num = 100;
		
		for (int i = 1; i <= num; i++) {
			
			if(i % 2 == 0)
				System.out.print(i + " ");	
		}
	}
}