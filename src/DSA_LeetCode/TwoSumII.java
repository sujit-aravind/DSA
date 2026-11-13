package DSA_LeetCode;

import java.util.Arrays;

public class TwoSumII {
	public int[] twoSum(int[] numbers, int target) {

		int[] pair = new int[2];

		int left = 0;
		int right = numbers.length - 1;
		int sum = 0;

		while (left < right) {

			sum = numbers[left] + numbers[right];

			if (sum == target) {
				pair[0] = left + 1;
				pair[1] = right + 1;
				return pair;
			}

			if (sum > target)
				right--;
			if (sum < target)
				left++;
		}
		return pair;
	}

	public static void main(String[] args) {
		int[] numbers = { 2, 7, 11, 15 };
		int target = 9;
		TwoSumII obj = new TwoSumII();
		int[] result = obj.twoSum(numbers, target);
		System.out.println(Arrays.toString(result));
	}
}