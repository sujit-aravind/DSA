package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class IntersectII {

	public int[] intersect(int[] nums1, int[] nums2) {

		List<Integer> list = new ArrayList<>();
		List<Integer> result = new ArrayList<>();

		for (int i = 0; i < nums1.length; i++) {
			list.add(nums1[i]);
		}

		for (int i = 0; i < nums2.length; i++) {

			boolean status = list.contains(nums2[i]);

			if (status == true) {
				result.add(nums2[i]);
				list.remove(Integer.valueOf(nums2[i]));
			}
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

		IntersectII obj = new IntersectII();

		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		int[] result = obj.intersect(nums1, nums2);
		
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

}