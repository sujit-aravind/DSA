package DSA_LeetCode;

import java.util.List;
import java.util.ArrayList;;

public class WordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {

		boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;

		for (int i = 1; i <= s.length(); i++) {
			for (String word : wordDict) {
				int len = word.length();

				if (i >= len && dp[i - len] && s.substring(i - len, i).equals(word)) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[s.length()];
	}

	public static void main(String[] args) {
		WordBreak word = new WordBreak();
		String s = "cars";
		List<String> list = new ArrayList<>();
		list.add("car");
		list.add("ca");
		list.add("rs");
		System.out.println(word.wordBreak(s, list));
	}
}