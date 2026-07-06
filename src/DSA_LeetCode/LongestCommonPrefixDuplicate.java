package DSA_LeetCode;

public class LongestCommonPrefixDuplicate {

	public static String longestCommonPrefix(String[] strs) {

		if (strs == null || strs.length == 0)
			return "";

		int length = strs[0].length();

		for (int i = 1; i < strs.length; i++) {

			if (length > strs[i].length())
				length = strs[i].length();
		}

		String val = "";
		char ch;

		for (int i = 0; i < length; i++) {
			ch = strs[0].charAt(i);
			for (int j = 1; j < strs.length; j++) {

				if (ch != strs[j].charAt(i)) {
					ch = '\0';
					break;
				}
			}
			if (ch != '\0')
				val = val + String.valueOf(ch);
			else
				break;
		}
		return val;
	}

	public static void main(String[] args) {
		String[] strs = { "dog", "racecar", "car" };
		System.out.println(longestCommonPrefix(strs));
	}
}