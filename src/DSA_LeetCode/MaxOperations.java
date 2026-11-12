package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class MaxOperations {
	public int maxOperations(int[] nums, int k) {

		int operation = 0;
		List<Integer> val = new ArrayList<>();
		for (int i = 0; i < nums.length; i++)
			val.add(nums[i]);
		
		for (int i = 0; i < val.size(); i++) {
			for (int j = i+1; j < val.size(); j++) {
				
			}
		}
		return 0;
	}
}