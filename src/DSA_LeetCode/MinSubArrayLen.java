package DSA_LeetCode;

public class MinSubArrayLen {
	public int minSubArrayLen(int target, int[] nums) {

		int sum = 0;
		int len = 0;
		int min_len = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			int j = i;
			while (j < nums.length) {

				sum = sum + nums[j];
				len++;
				if ((sum >= target) && (min_len > len)) {
					min_len = len;
				}
				j++;
			}
			len = 0;
			sum = 0;
		}
		
		if(min_len == Integer.MAX_VALUE)
			return 0;
		
		return min_len;
	}

	public static void main(String[] args) {
		MinSubArrayLen obj = new MinSubArrayLen();
		int target = 7;
		int[] nums = { 2, 3, 1, 2, 4, 3 };
		int result = obj.minSubArrayLen(target, nums);
		System.out.println("Minimum Length: " + result);
	}
}