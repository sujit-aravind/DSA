package DSA_LeetCode;

class removeDuplicates {
	public int removeDuplicates(int[] nums) {

		int position;
		int index;

//		1, 1, 2, 2, 3, 3, 4

		for (int i = 0; i < nums.length; i++) {

			if (i + 1 < nums.length) {

				position = nums[i + 1];
				index = i + 1;
				
				do {
					if (nums[i] == position) {
						if (index + 1 < nums.length) {
							index++;
							position = nums[index];
						}
					}
				} while (nums[i] != position);
				
				if(nums[i+1] != position) {
					nums[i] = position;
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