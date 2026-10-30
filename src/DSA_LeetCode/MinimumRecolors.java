package DSA_LeetCode;

public class MinimumRecolors {
	public int minimumRecolors(String blocks, int k) {
		int minCount = Integer.MAX_VALUE;
		int count = 0;
		for (int i = 0; i <= blocks.length() - k; i++) {
			int j = i;
			while (j < i+k) {
				if (blocks.charAt(j) == 'W')
					count++;
				j++;
			}
			if (minCount > count)
				minCount = count;
			count = 0;
		}
		return minCount;
	}
}