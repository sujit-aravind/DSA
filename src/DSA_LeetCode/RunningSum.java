package DSA_LeetCode;

public class RunningSum {
	public int[] runningSum(int[] nums) {

		int[] arr = new int[nums.length];

		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			while (j <= i) {
				arr[i] += nums[j];
				j++;
			}
		}
		return arr;
	}
}