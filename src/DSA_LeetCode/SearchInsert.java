package DSA_LeetCode;

public class SearchInsert {

	public static int searchInsert(int[] nums, int target) {

		int index = 0, position = 0;

		for (int i = 0; i < nums.length; i++) {

			index = i + 1;
			
			if (nums[i] == target) {
				position = i;
				return position;
			}
			
			if(nums.length >= index)
				return index;

			if ((nums[i] <= target) && (nums[index] > target)) {
				position = index;
				return position;
			}
		}
		return position = index;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };
		int target = 7;

		int result = searchInsert(nums, target);

		System.out.println(result);
	}

}