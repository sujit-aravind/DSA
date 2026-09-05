package DSA_LeetCode;

public class ValidPalindrome {

	public boolean isPalindrome(String s) {

		String word = "";
		s = s.toLowerCase();
		boolean isCharacter;

		for (int i = 0; i < s.length(); i++) {

			isCharacter = Character.isLetterOrDigit(s.charAt(i));

			if (isCharacter == true) {
				word = word + s.charAt(i);
			}
		}

		int i = 0;
		int j = word.length() - 1;
		boolean status = true;

		while (i < j) {

			if (!(word.charAt(i) == word.charAt(j))) {
				status = false;
				break;
			}
			i++;
			j--;
		}

		return status;
	}

	public static void main(String[] args) {

		ValidPalindrome obj = new ValidPalindrome();

		System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(obj.isPalindrome("race a car"));
		System.out.println(obj.isPalindrome(" "));
		System.out.println(obj.isPalindrome("madam"));
		System.out.println(obj.isPalindrome("hello"));
	}
}