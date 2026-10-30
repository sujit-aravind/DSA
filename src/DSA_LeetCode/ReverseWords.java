package DSA_LeetCode;

public class ReverseWords {
	public String reverseWords(String s) {
		String[] words = s.trim().split("\\s+");
		int len = words.length - 1;
		String output = "";

		for (int i = len; i >= 0; i--) {
			int j = words[i].length() - 1;
			int h = 0;
			while (h <= j) {
				char ch = words[i].charAt(h);
				output += ch;
				h++;
			}
			output += " ";
		}
		return output.stripTrailing();
	}

	public static void main(String[] args) {
		ReverseWords reverse = new ReverseWords();
		System.out.println("output : " + reverse.reverseWords("the sky is blue"));
	}
}