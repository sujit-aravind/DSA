package DSA_LeetCode;

public class CountSegments {
	public int countSegments(String s) {
		if (s.isEmpty())
			return 0;
		if (s.isBlank())
			return 0;
		String[] words = s.trim().split("\\s+");
		return words.length;
	}

	public static void main(String[] args) {
		CountSegments sol = new CountSegments();
		String s = ", , , ,        a, eaefa";
		int result = sol.countSegments(s);
		System.out.println(result);
	}
}