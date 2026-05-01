package DSA_LeetCode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		char ch;
		String val = "";
		if (strs == null || strs.length == 0)
			return "";
		for (int i = 0; i < strs[0].length(); i++) {
			ch = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {
				if ((i >= strs[j].length()) || (ch != strs[j].charAt(i)))
					return val;
			}
			val = val + ch;
		}
		return val;
	}
}