package DSA_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class MaxOperations {

	public int maxOperations(int[] nums, int k) {
		int operation = 0;
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int remaining = k - nums[i];
			if (map.containsKey(remaining) && map.get(remaining) > 0) {
				operation++;
				map.put(remaining, map.get(remaining) - 1);
			} else
				map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		return operation;
	}

	public static void main(String[] args) {
		MaxOperations sol = new MaxOperations();
		int[] nums = { 1, 2, 3, 4 };
		int k = 5;
		int result = sol.maxOperations(nums, k);
		System.out.println("Maximum Operations: " + result);
	}
}