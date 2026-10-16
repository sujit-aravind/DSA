package DSA_LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	List<List<Integer>> output = new ArrayList<>();
	List<Integer> input = new ArrayList<>();

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {

		if (candidates == null)
			return null;
		Arrays.sort(candidates);
		candidate(candidates, 0, target);
		return output;
	}

	void candidate(int[] candidates, int index, int target) {

		if (target == 0) {
			if (!output.contains(input)) {
				output.add(new ArrayList<>(input));
			}
			return;
		}

		if (target < 0)
			return;

		for (int i = index; i < candidates.length; i++) {

			if (i > index && candidates[i] == candidates[i - 1])
				continue;

			input.add(candidates[i]);
			candidate(candidates, i + 1, target - candidates[i]);
			input.remove(input.size() - 1);
		}
	}

	public static void main(String[] args) {

		CombinationSumII obj = new CombinationSumII();

		int[] candidates = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;

		List<List<Integer>> result = obj.combinationSum2(candidates, target);
		System.out.println(result);
	}
}