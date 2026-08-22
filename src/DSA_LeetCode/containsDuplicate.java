package DSA_LeetCode;

import java.util.HashSet;

public class containsDuplicate {
	public boolean containsDuplicate(int[] nums) {

		boolean status = false;

		HashSet<Integer> set = new HashSet<>();

		for (int i : nums) {
			status = set.contains(i);
			if (status == true)
				return status;
			set.add(i);
		}
		return status;
	}

	public static void main(String[] args) {

		containsDuplicate obj = new containsDuplicate();

		int[] nums1 = { 1, 2, 3, 1 };
		int[] nums2 = { 1, 2, 3, 4 };
		int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

		System.out.println(obj.containsDuplicate(nums1));
		System.out.println(obj.containsDuplicate(nums2));
		System.out.println(obj.containsDuplicate(nums3));
	}

}