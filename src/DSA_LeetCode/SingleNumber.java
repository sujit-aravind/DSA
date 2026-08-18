package DSA_LeetCode;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		
		int digit = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j])
					break;
				digit = nums[i];
			}
		}
		return digit;
	}
}