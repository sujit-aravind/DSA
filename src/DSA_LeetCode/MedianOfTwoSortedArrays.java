package DSA_LeetCode;

public class MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length) {
			return findMedianSortedArrays(nums2, nums1);
		}

		int totalLength = nums1.length + nums2.length;
		int leftLength = (totalLength + 1) / 2;
		int low = 0;
		int high = nums1.length;

		while (low <= high) {
			int partition1 = (low + high) / 2;
			int partition2 = leftLength - partition1;
			int left1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
			int right1 = (partition1 == nums1.length) ? Integer.MAX_VALUE : nums1[partition1]; 
			int left2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
			int right2 = (partition2 == nums2.length) ? Integer.MAX_VALUE : nums2[partition2];
			if (left1 <= right2 && left2 <= right1) {
				if (totalLength % 2 != 0) {
					return Math.max(left1, left2);
				}
				return (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
			} else if (left1 > right2) {
				high = partition1 - 1;
			} else {
				low = partition1 + 1;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		MedianOfTwoSortedArrays obj = new MedianOfTwoSortedArrays();
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };
		double result = obj.findMedianSortedArrays(nums1, nums2);
		System.out.println("Median = " + result);
	}
}