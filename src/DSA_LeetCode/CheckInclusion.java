package DSA_LeetCode;

public class CheckInclusion {
	public boolean checkInclusion(String s1, String s2) {

		int windowSize = s1.length();
		 boolean isFound = false;
		
		for (int i = 0; i <= s2.length() - windowSize; i++) {
			 isFound = true;
			int j = i;
			while (j < i + windowSize) {
				if (!(s1.contains(String.valueOf(s2.charAt(j))))) {
					isFound = false;
					break;
				}
				isFound = true;
				j++;
			}
			if (isFound == true)
				return true;
		}
		return isFound;
	}

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbaooo";
		CheckInclusion obj = new CheckInclusion();
		boolean result = obj.checkInclusion(s1, s2);
		System.out.println(result);
	}
}