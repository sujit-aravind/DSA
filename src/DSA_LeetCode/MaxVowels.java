package DSA_LeetCode;

public class MaxVowels {
	public int maxVowels(String s, int k) {

		int max_length = 0;
		int max = 0;

		for (int i = 0; i <= s.length() - k; i++) {
			int j = i;
			while (j < i + k) {
				if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o'
						|| s.charAt(j) == 'u')
					max++;
				j++;
			}
			if (max_length < max)
				max_length = max;
			max = 0;
		}
		return max_length;
	}
}