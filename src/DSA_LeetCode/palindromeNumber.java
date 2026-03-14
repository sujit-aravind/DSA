package DSA_LeetCode;
public class palindromeNumber {
	
	public static boolean isPalindrome(int x) {
		
		int temp = x, rev = 0;
		
		while(temp > 0) {
			
			rev = (rev * 10) + temp % 10;
			temp /= 10;
		}
		
		if(rev == x)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
		int x = 121;
		
		if(isPalindrome(x) == true)
			System.out.println(x + " is a palindrome");
		else
			System.out.println(x + " is not a palindrome");
	}
}