package DSA_LeetCode;

public class CountGoodSubstrings {
	public int countGoodSubstrings(String s) {

		int count = 0;

		for (int i = 2; i < s.length(); i++) {

			int currentValue = s.charAt(i);
			int oldValue = s.charAt(i - 1);
			int initialValue = s.charAt(i - 2);

			if ((currentValue != oldValue) && (currentValue != initialValue) && (oldValue != initialValue))
				count++;
		}
		return count;
	}
}