package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {
	public int singleNumber(int[] nums) {

		int result = 0;
		boolean status = false;

		List<Integer> dublicate = new ArrayList<>();
		List<Integer> original = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {
					status = false;
					dublicate.add(nums[i]);
					break;
				} else {
					status = true;
				}
			}

			if ((status == true) && (!original.contains(nums[i]) 
					             && (!dublicate.contains(nums[i]))))
				original.add(nums[i]);
			
			if((!original.contains(nums[i]) && (!dublicate.contains(nums[i]))))
				original.add(nums[i]);
		}

		for (int i = 0; i < original.size(); i++) {
			if (dublicate.contains(original.get(i))) {
			} else {
				result = original.get(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {

		SingleNumber obj = new SingleNumber();

		int[] nums = { 2, 2, 1 };

		int result = obj.singleNumber(nums);

		System.out.println(result);
	}

}