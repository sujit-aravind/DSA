package DSA_LeetCode;

import java.util.Arrays;

public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		if (nums.length == 0)
			return 0;
		int k = 0, index;
		boolean status;
		for (int i = 0; i < nums.length; i++) {
			index = i + 1;
			status = nums[i] == val;
			if (status == true) {
				do {
					if (index < nums.length) {
						status = nums[index] != val;
						if (status == true) {
							nums[i] = nums[index];
							nums[index] = val;
							k++;
							break;
						} else {
							index++;
						}
					} else
						break;
				} while (true);
			} else {
				k++;
			}
		}
		return k;
	}

	public static void main(String[] args) {

		RemoveElement obj = new RemoveElement();

		int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int val = 2;
		int k = obj.removeElement(nums, val);

		System.out.println("k = " + k);
		System.out.println("Array = " + Arrays.toString(nums));
		System.out.print("First " + k + " elements: ");
		for (int i = 0; i < k; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}