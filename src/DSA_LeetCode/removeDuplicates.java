package DSA_LeetCode;

class removeDuplicates {
	public int removeDuplicates(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int k = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[k - 1]) {
				nums[k] = nums[i];
				k++;
			}
		}

		return k;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 2, 3, 3, 4, 5};

		removeDuplicates remove = new removeDuplicates();
		int k = remove.removeDuplicates(nums);
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}