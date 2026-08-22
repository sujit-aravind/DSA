package DSA_LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

	public List<String> summaryRanges(int[] nums) {

		List<String> list = new ArrayList<>();

		String previousValue, currentValue = null;

		long digit;
		int j;

		for (int i = 0; i < nums.length; i++) {

			digit = nums[i];
			previousValue = String.valueOf(nums[i]);
			System.out.println(i);
			System.out.println(digit);
			System.out.println(previousValue);

			for (j = i + 1; j < nums.length; j++) {

				digit++;
				System.out.println(digit + " " + j + " " + nums[j]);

				if (digit != nums[j])
					break;

				currentValue = String.valueOf(nums[j]);
				System.out.println(currentValue);
			}

			System.out.println(previousValue + " " + currentValue);

			if (currentValue == null) {
				list.add(previousValue);
			} else if ((Long.parseLong(previousValue) <= Long.parseLong(currentValue))) {
				list.add(previousValue + "->" + currentValue);
			} else {
				list.add(previousValue);
			}

			previousValue = null;
			currentValue = null;

			if (list != null)
				i = j - 1;
			System.out.println(i + " " + j);
		}
		return list;
	}

	public static void main(String[] args) {
		SummaryRanges obj = new SummaryRanges();
		int[] nums = { -2147483648, -2147483647, 2147483647 };
		List<String> result = obj.summaryRanges(nums);
		System.out.println(result);
	}
}