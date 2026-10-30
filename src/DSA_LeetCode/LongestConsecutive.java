package DSA_LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestConsecutive {
	public int longestConsecutive(int[] nums) {
		Arrays.sort(nums);
		int len = 0;
		int i = 0;
		int sequence;
		List<Integer> list;
		while (i != nums.length) {
			sequence = 0;
			list = new ArrayList<>();
			for (; i < nums.length; i++) {
				if (list.isEmpty()) {
					list.add(nums[i]);
					sequence++;
					continue;
				}
				if ((list.getLast() + 1 != nums[i]) && (list.getLast() != nums[i]))
					break;

				if (list.getLast() != nums[i]) {
					list.add(nums[i]);
					sequence++;
				}
			}
			if (sequence > len)
				len = sequence;
		}
		return len;
	}
}