package DSA_LeetCode;

public class ReverseWordsII {
	public String reverseWords(String s) {
		if (s.isBlank())
			return null;
		if (s.isEmpty())
			return null;

		String[] words = s.split("\\s+");
		String output = "";
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			int j = word.length() - 1;

			while (j >= 0) {
				output += word.charAt(j);
				j--;
			}
			if (i == words.length - 1)
				break;
			output += " ";
		}
		return output;
	}
}