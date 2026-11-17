package DSA_LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDup {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> output = new ArrayList<>();
		output.add(new ArrayList<>());
		int previousSize = 0;
		for (int i = 0; i < nums.length; i++) {
			int size = output.size();
			int start = 0;
			if (i > 0 && nums[i] == nums[i - 1])
				start = previousSize;
			previousSize = size;
			for (int j = start; j < size; j++) {
				List<Integer> input = new ArrayList<>(output.get(j));
				input.add(nums[i]);
				output.add(input);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		SubsetsWithDup obj = new SubsetsWithDup();
		int[] nums = { 1, 2, 2 };
		List<List<Integer>> result = obj.subsetsWithDup(nums);
		System.out.println(result);
	}
}