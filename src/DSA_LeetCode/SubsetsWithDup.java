package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SubsetsWithDup {
	public List<List<Integer>> subsetsWithDup(int[] nums) {
		List<Integer> input = new ArrayList<Integer>();
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		output.add(new ArrayList<Integer>());

		for (int i = 0; i < nums.length; i++) {
			input.add(nums[i]);
			if (!output.contains(input))
				output.add(input);
			input = new ArrayList<Integer>();
		}
		return null;
	}
}