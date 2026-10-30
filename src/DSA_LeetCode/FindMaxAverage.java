package DSA_LeetCode;

public class FindMaxAverage {
	public double findMaxAverage(int[] nums, int k) {
		double max = Double.NEGATIVE_INFINITY;
		double sum = 0;

		for (int i = 0; i <= nums.length - k; i++) {
			int j = i;
			while (j < i + k) {
				sum = sum + nums[j];
				j++;
			}
			sum = sum / k;
			if (max < sum)
				max = sum;
			sum = 0;
		}
		return max;
	}
}