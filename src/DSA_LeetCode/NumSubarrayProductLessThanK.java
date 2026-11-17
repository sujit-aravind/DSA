package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class NumSubarrayProductLessThanK {
	public int numSubarrayProductLessThanK(int[] nums, int k) {
		int sum;
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> input;
		for (int i = 0; i < nums.length; i++) {
			sum = 1;
			input = new ArrayList<>();
			for (int j = i; j < nums.length; j++) {
				sum *= nums[j];
				if (sum < k) {
					input.add(nums[j]);
					list.add(new ArrayList<Integer>(input));
				} else
					break;
			}
		}
		return list.size();
	}

	public static void main(String[] args) {
		int[] nums = {686, 28, 455, 675, 605, 29, 942, 48, 502, 889, 854,
				206, 231, 796, 272, 565, 887, 969, 558, 13, 22, 455, 145, 
				804, 15};
		int k = 515854;
		NumSubarrayProductLessThanK sol = new NumSubarrayProductLessThanK();
		int result = sol.numSubarrayProductLessThanK(nums, k);
		System.out.println("Output: " + result);
	}
}