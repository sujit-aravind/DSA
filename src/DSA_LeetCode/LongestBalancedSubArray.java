package DSA_LeetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestBalancedSubArray {

	public int longestBalanced(int[] nums) {

	    int n = nums.length;
	    int maxLength = 0;

	    for (int start = 0; start < n; start++) {

	        Set<Integer> evenSet = new HashSet<>();
	        Set<Integer> oddSet = new HashSet<>();

	        for (int end = start; end < n; end++) {

	            if (nums[end] % 2 == 0) {
	                evenSet.add(nums[end]);
	            } else {
	                oddSet.add(nums[end]);
	            }

	            if (evenSet.size() == oddSet.size()) {
	                int length = end - start + 1;
	                maxLength = Math.max(maxLength, length);
	            }
	        }
	    }

	    return maxLength;
	}

	public static void main(String[] args) {

		Scanner ur = new Scanner(System.in);

		System.out.print("enter size : ");
		int size = ur.nextInt();

		System.out.print("enter value : ");
		int[] arr = new int[size];
		ur.close();

//		System.out.println("longest balanced sub array is : " + longestBalanced(arr));
	}
}