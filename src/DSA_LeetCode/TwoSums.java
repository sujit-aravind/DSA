package DSA_LeetCode;

public class TwoSums {

	public int[] twoSums(int[] nums, int target) {

		int[] temp = nums;
		int[] bal = new int[2];

		int sum, minus;

		for (int i = 0; i < temp.length; i++) {

			sum = target - temp[i];

			for (int j = i + 1; j < temp.length; j++) {

				minus = target - temp[j];

				if ((sum + minus) == target) {

					bal[0] = i;
					bal[1] = j;
					return bal;
				}
			}
		}
		
		throw new IllegalArgumentException("solution not found");
	}

	public static void main(String[] args) {
		
		int[] arr = {2,11,7,15};
		int target = 9;
		TwoSums ts = new TwoSums();
		
		int[] result = ts.twoSums(arr, target);
		
		System.out.println(result[0] + " " + result[1]);
	}
}