package DSA_LeetCode;

class removeDuplicates {
	public int removeDuplicates(int[] nums) {

		String index;
		int position = 0;
		boolean status;

		for (int i = 0; i < nums.length; i++) {

			if (i == 0) {
				index = String.valueOf(i);
				position = nums[i];
			}

			if (i != 0) {

				if (position == nums[i]) {

				}

			}
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {

		int[] nums = { 1, 1, 2, 2, 3, 3, 4 };

		removeDuplicates remove = new removeDuplicates();
		int k = remove.removeDuplicates(nums);
		System.out.println("k = " + k);
		System.out.print("Array: ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}