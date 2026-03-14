package DSA_LeetCode;

public class LongestSubString {
	public static int lengthOfLongestSubstring(String s) {

	    int max = 0;

	    for (int i = 0; i < s.length(); i++) {

	        String sub = "";

	        for (int j = i; j < s.length(); j++) {

	            char ch = s.charAt(j);

	            if (sub.contains("" + ch)) {
	                break;
	            }

	            sub = sub + ch;

	            if (sub.length() > max) {
	                max = sub.length();
	            }
	        }
	    }

	    return max;
	}

	public static void main(String[] args) {

		String stream = "abcabcbb";
		int num = lengthOfLongestSubstring(stream);
		System.out.println("unique letters in count : " + num);

	}
}