package DSA_LeetCode;

public class NumOfSubarrays {
	public int numOfSubarrays(int[] arr, int k, int threshold) {

		int sum = 0;
		int count = 0;

		for (int i = 0; i <= arr.length - k; i++) {
			int j = i;
			while (j < i + k) {
				sum = sum + arr[j];
				j++;
			}
			int average = sum / k;
			if (average >= threshold)
				count++;
			sum = 0;
		}
		return count;
	}
}