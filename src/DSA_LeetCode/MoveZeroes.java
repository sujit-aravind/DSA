package DSA_LeetCode;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == 0) {
					if (nums[j] == 0) {
						if ((j + 1) < nums.length) {
							nums[j] = nums[j + 1];
							nums[j + 1] = 0;
						}
					}
					nums[i] = nums[j];
					nums[j] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		MoveZeroes obj = new MoveZeroes();
		int[] nums = { 0, 1, 0, 5, 2 };
		obj.moveZeroes(nums);
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}