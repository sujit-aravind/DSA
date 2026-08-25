package DSA_LeetCode;

public class FirstOccurrence {

	public int strStr(String haystack, String needle) {

		int index = -1;

		if (needle.length() > haystack.length())
			return index;

		int needleIndex = 0;
		String feed = "";

		for (int i = 0; i < haystack.length(); i++) {

			if (needleIndex < needle.length()) {

				if ((haystack.charAt(i) == needle.charAt(needleIndex)) && (needleIndex == 0)) {

					index = i;
					feed = "";
				}

				if (haystack.charAt(i) == needle.charAt(needleIndex)) {

					feed = feed + needle.charAt(needleIndex);
					needleIndex++;

					if (needleIndex == needle.length())
						return index;

				} else {

					if (needleIndex > 0)
						i = index;

					needleIndex = 0;
					index = -1;
					feed = "";
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		FirstOccurrence obj = new FirstOccurrence();

		String haystack = "aaab";
		String needle = "aab";
		int result = obj.strStr(haystack, needle);
		System.out.println(result);
	}

}
