package DSA_LeetCode;

public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int digit = 0, addsOn = 0;
		if (m == 0) {
			for (int i = 0; i < nums1.length; i++) {
				nums1[i] = nums2[i];
			}
			
		} else {
			for (int i = m + addsOn; i < nums1.length; i++) {
				if (digit + 1 <= n) {
					nums1[i] = nums2[digit];
					digit++;
					addsOn++;
				}
			}

			digit = 0;

			for (int i = 0; i < nums1.length; i++) {
				for (int j = i + 1; j < nums1.length; j++) {

					if (nums1[i] > nums1[j]) {
						digit = nums1[i];
						nums1[i] = nums1[j];
						nums1[j] = digit;
					}
				}
			}
		}
	}
}