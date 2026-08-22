package DSA_LeetCode;

public class MissingNumber {
	public int missingNumber(int[] nums) {

		int val, digit = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] > nums[j]) {
					val = nums[i];
					nums[i] = nums[j];
					nums[j] = val;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {

			if (nums[0] != 0)
				return digit = 0;

			digit = nums[i];
			digit++;
			
			if(i+1 < nums.length) {
			if (nums[i + 1] != digit)
				return digit;
			}
		}
		return digit;
	}
	
	public static void main(String[] args) {
		MissingNumber obj = new MissingNumber();
		int[] nums = {0, 1, 2};
		System.out.println(obj.missingNumber(nums));
	}
}