package DSA_LeetCode;

import java.util.HashMap;

public class ContainsNearbyDuplicate {

	public boolean containsNearbyDuplicate(int[] nums, int k) {

		boolean status = false;
		int val;

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			status = map.containsKey(nums[i]);

			if (status == true) {
				val = map.get(nums[i]);

				if ((i - val) <= k)
					return true;
				status = false;
			}
			map.put(nums[i], i);
		}

		if (status == false)
			return false;
		return status;
	}

	public static void main(String[] args) {
		ContainsNearbyDuplicate obj = new ContainsNearbyDuplicate();
		int[] nums = { 1, 0, 1, 1 };
		int k = 3;
		boolean result = obj.containsNearbyDuplicate(nums, k);
		System.out.println(result);
	}

}