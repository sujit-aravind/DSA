package DSA_LeetCode;

public class SearchInsert {

	public static int searchInsert(int[] nums, int target) {

		int index = 0, position = 0;

		for (int i = 0; i < nums.length; i++) {
			
			if(index+1 < nums.length)
				index++;
			
		}
		return 0;
	}

	public static void main(String[] args) {

		int[] nums = { 1, 3, 5, 6 };
		int target = 5;

		int result = searchInsert(nums, target);

		System.out.println(result);
	}

}