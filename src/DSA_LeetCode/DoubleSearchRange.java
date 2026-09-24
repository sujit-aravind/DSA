package DSA_LeetCode;

public class DoubleSearchRange {
	public int[] searchRange(int[] nums, int target) {

		int[] arr = { -1, -1 };

		if (nums.length == 0)
			return arr;

		int left = 0;
		int right = nums.length - 1;
		int mid;

		while (left <= right) {

			mid = (left + right) / 2;

			if (nums[mid] == target) {
				arr[0] = mid;
				right = mid - 1;
			} else if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		
		if (arr[0] == -1)
			return arr;

		left = arr[0];
		right = nums.length - 1;

		while (left <= right) {

			mid = (left + right) / 2;

			if (nums[mid] == target) {
				arr[1] = mid;
				left = mid + 1;
			} else if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return arr;
	}

	public static void main(String[] args) {
		DoubleSearchRange obj = new DoubleSearchRange();
		int[] nums = { 5, 6, 7, 7, 8, 10 };
		int target = 7;
		int[] result = obj.searchRange(nums, target);
		System.out.println("[" + result[0] + ", " + result[1] + "]");
	}
}