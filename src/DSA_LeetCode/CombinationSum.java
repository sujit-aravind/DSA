package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	List<List<Integer>> output = new ArrayList<>();
	List<Integer> input = new ArrayList<>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {

		if (candidates == null)
			return output;

		candidate(candidates, 0, target);
		return output;
	}

	void candidate(int[] candidates, int index, int target) {

		if (target == 0) {
			output.add(new ArrayList<>(input));
			return;
		}

		if (target < 0)
			return;

		for (int i = index; i < candidates.length; i++) {

			input.add(candidates[i]);
			candidate(candidates, i, target - candidates[i]);
			input.remove(input.size() - 1);
		}
	}

	public static void main(String[] args) {
		CombinationSum obj = new CombinationSum();
		int[] candidates = { 2, 3, 6, 7 };
		int target = 7;
		List<List<Integer>> result = obj.combinationSum(candidates, target);
		System.out.println(result);
	}
}