package DSA_LeetCode;
import java.util.Scanner;

public class Reverse_Integer {

	public static int reverse(int x) {

		int rev = 0, sum = 0;

		while (x != 0) {

			sum = x % 10;
			x /= 10;

			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && sum > 7)) {
				return 0;
			}

			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && sum < -8)) {
				return 0;
			}

			rev = (rev * 10) + sum;
		}

		return rev;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter value : ");
		int num = ur.nextInt();
		ur.close();

		if (reverse(num) > 0)
			System.out.println(num + "safely reverses");
		else
			System.out.println(num + "this value overflowed");

	}

}