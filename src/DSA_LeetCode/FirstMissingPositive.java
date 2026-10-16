package DSA_LeetCode;

public class FirstMissingPositive {

	public int firstMissingPositive(int[] nums) {

		int index = 0, temp = 0, i = 0;

		while (i < nums.length) {

			if (nums[i] <= 0 || nums[i] > nums.length) {
				i++;
				continue;
			}

			index = nums[i] - 1;

			if (nums[i] != nums[index]) {
				temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
			} else
				i++;
		}

		for (i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}
		return nums.length + 1;
	}

	public static void main(String[] args) {

		FirstMissingPositive obj = new FirstMissingPositive();

		int[] nums = { 0, 2, 2, 1, 1 };

		System.out.println(obj.firstMissingPositive(nums));
	}
}