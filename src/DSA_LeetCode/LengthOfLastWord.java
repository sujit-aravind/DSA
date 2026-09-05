package DSA_LeetCode;

public class LengthOfLastWord {

	public int lengthOfLastWord(String s) {

		int wordLength = 0;
		int lastWord = s.length() - 1;
		boolean status;

		for (int i = s.length() - 1; i >= 0; i--) {

			status = false;

			if ((i == lastWord) && (s.charAt(i)) == ' ') {
				lastWord--;
				status = true;
			}
			
			if (status == false) {

				if (s.charAt(i) == ' ')
					break;
				
				wordLength++;
			}
		}
		
		return wordLength;
	}

	public static void main(String[] args) {

		LengthOfLastWord obj = new LengthOfLastWord();

		System.out.println(obj.lengthOfLastWord("Hello World"));
		System.out.println(obj.lengthOfLastWord("   fly me   to   the moon  "));
		System.out.println(obj.lengthOfLastWord("luffy is still joyboy"));
		System.out.println(obj.lengthOfLastWord("a"));
		System.out.println(obj.lengthOfLastWord("aa"));
		System.out.println(obj.lengthOfLastWord("Hello World   "));
	}
}