package DSA_LeetCode;

import java.util.Arrays;
import java.util.HashSet;

public class Intersection {

	public int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> result = new HashSet<>();

		for (int i = 0; i < nums1.length; i++) {
			set.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {

			boolean status = set.contains(nums2[i]);

			if ((status == true) && !(result.contains(nums2[i])))
				result.add(nums2[i]);
		}

		int[] output = new int[result.size()];

		int index = 0;

		for (int i : result) {

			output[index] = i;
			index++;
		}

		return output;
	}
	
	public static void main(String[] args) {

		Intersection obj = new Intersection();

	    int[] nums1 = {1, 2, 2, 1};
	    int[] nums2 = {2, 2};
	    int[] result = obj.intersection(nums1, nums2);
	    System.out.println(Arrays.toString(result));
	}
}