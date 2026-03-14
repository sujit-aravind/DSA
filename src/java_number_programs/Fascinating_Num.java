package java_number_programs;
import java.util.Scanner;

public class Fascinating_Num {

	static boolean Fascinating(int n) {

	    String combined = String.valueOf(n)
	                    + String.valueOf(n * 2)
	                    + String.valueOf(n * 3);

	    int n0 = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0,
	        n5 = 0, n6 = 0, n7 = 0, n8 = 0, n9 = 0;

	    for (int i = 0; i < combined.length(); i++) {
	        char ch = combined.charAt(i);

	        switch (ch) {
	            case '0': n0++; break;
	            case '1': n1++; break;
	            case '2': n2++; break;
	            case '3': n3++; break;
	            case '4': n4++; break;
	            case '5': n5++; break;
	            case '6': n6++; break;
	            case '7': n7++; break;
	            case '8': n8++; break;
	            case '9': n9++; break;
	        }
	    }

	    if (n0 == 0 &&
	        n1 == 1 && n2 == 1 && n3 == 1 &&
	        n4 == 1 && n5 == 1 && n6 == 1 &&
	        n7 == 1 && n8 == 1 && n9 == 1) {
	        return true;
	    }

	    return false;
	}

	public static void main(String[] args) {

	    Scanner ur = new Scanner(System.in);

	    System.out.print("enter value : ");
	    int num = ur.nextInt();
	    ur.close();

	    int n = num;
	    int digit = 0;

	    while (n > 0) {
	        n /= 10;
	        digit++;
	    }

	    if (digit == 3) {

	        if (Fascinating(num))
	            System.out.println(num + " is a fascinating number");
	        else
	            System.out.println(num + " is not a fascinating number");

	    } else {
	        System.out.println(num + " is not a 3-digit number");
	    }
	}
}