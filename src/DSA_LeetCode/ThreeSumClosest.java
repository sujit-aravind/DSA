package DSA_LeetCode;

import java.util.Arrays;

public class ThreeSumClosest {

	public int threeSumClosest(int[] nums, int target) {

		Arrays.sort(nums);

		int currentDiff, diff = 0, sum = 0, closest = 0;
		boolean status = false;

		for (int i = 0; i < nums.length - 2; i++) {

			if (i == 0)
				status = true;

			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {

				sum = nums[i] + nums[left] + nums[right];
				currentDiff = Math.abs(target - sum);

				if (status == true) {
					diff = currentDiff;
					closest = sum;
				}
				status = false;

				if (currentDiff < diff) {
					diff = currentDiff;
					closest = sum;
				}

				if (sum < target)
					left++;
				else if (sum > target)
					right--;
				else
					return closest = sum;
			}
		}
		return closest;
	}

	public static void main(String[] args) {

		ThreeSumClosest obj = new ThreeSumClosest();
		int[] nums = { -1, 2, 1, -4 };
		int target = 1;
		int result = obj.threeSumClosest(nums, target);
		System.out.println(result);
	}
}