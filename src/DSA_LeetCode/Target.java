package DSA_LeetCode;

public class Target {

	public int[] twoSum(int[] nums, int target) {

		int res[] = new int[2];
		boolean status = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] + nums[j] == target) {
					res[0] = i;
					res[1] = j;
					status = true;
					break;
				}
			}
			if(status == true)
				break;
		}
		return res;
	}

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5 };
		int target = 5;

		if (num.length > 2) {
			Target t = new Target();
			
			for (int i : t.twoSum(num, target)) {
				System.out.print(i + " ");
			}
		} else {

			int temp = num[0] + num[1];
			boolean status = temp == target;

			if (status == true)
				for (int i : num) {
					System.out.print(i + " ");
				}
		}
	}
}