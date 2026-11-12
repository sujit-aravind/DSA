package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MaxOperations {
	public int maxOperations(int[] nums, int k) {

		int operation = 0;
		int numsI = 0;
		int sum = 0;

		List<Integer> val = new ArrayList<>();
		List<Integer> index = new ArrayList<>();

		for (int i = 0; i < nums.length; i++)
			val.add(nums[i]);

		for (int i = 0; i < val.size(); i++) {
			sum = val.get(i);
			numsI = val.get(i);
			for (int j = i + 1; j < val.size(); j++) {
				sum = sum + val.get(j);
				if (sum == k) {
					index.add(i);
					index.add(j);
					break;
				}
				sum = numsI;
			}

			if (sum == k) {
				operation++;
				int count = index.size() - 1;
				while (count >= 0) {
					val.remove(index.get(count).intValue());
					count--;
				}
				i--;
			}
			sum = 0;
			index = new ArrayList<>();
		}
		return operation;
	}

	public static void main(String[] args) {
		MaxOperations sol = new MaxOperations();
		int[] nums = { 3, 1, 5, 1, 1, 1, 1, 1, 2, 2, 3, 2, 2 };
		int k = 1;
		int result = sol.maxOperations(nums, k);
		System.out.println("Maximum Operations: " + result);
	}
}