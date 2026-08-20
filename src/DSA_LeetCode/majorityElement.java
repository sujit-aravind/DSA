package DSA_LeetCode;

public class majorityElement {

	public int majorityElement(int[] nums) {

		if (nums.length - 1 == 0)
			return nums[0];

		int result = 0, count = 0, index = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					count++;
				}

				if (count > result) {
					result = count;
					index = nums[i];
				}
			}
			count = 0;
		}
		return index;
	}

	public static void main(String[] args) {
		int[] nums = { 8, 8, 7, 7, 7 };
		majorityElement obj = new majorityElement();
		int result = obj.majorityElement(nums);
		System.out.println(result);
	}

}