package DSA_LeetCode;

public class LongestOnes {
	public int longestOnes(int[] nums, int k) {

		int maxLen = Integer.MIN_VALUE;
		int max = 0;
		int kCount = 0;
		for (int i = 0; i < nums.length; i++) {
			int j = i;
			while (j < nums.length) {
				if (nums[j] == 1)
					max++;
				else {
					if (kCount == k)
						break;
					max++;
					kCount++;
				}
				j++;
			}
			if (maxLen < max)
				maxLen = max;
			max = 0;
			kCount = 0;
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
		int k = 2;
		LongestOnes sol = new LongestOnes();
		int result = sol.longestOnes(nums, k);
		System.out.println(result);
	}
}