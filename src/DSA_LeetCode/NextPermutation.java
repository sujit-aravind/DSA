package DSA_LeetCode;

public class NextPermutation {

	public void nextPermutation(int[] nums) {

		if (nums.length == 0)
			return;

		int temp;
		boolean status = false;

		for (int i = nums.length - 2; i >= 0; i--) {
			for (int j = nums.length - 1; j > i; j--) {
				if (nums[i] < nums[j]) {
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					status = true;
					break;
				}
			}

			if (status == true) {

				for (int x = i + 1; x < nums.length - 1; x++) {
					for (int y = x + 1; y < nums.length; y++) {

						if (nums[x] > nums[y]) {
							temp = nums[x];
							nums[x] = nums[y];
							nums[y] = temp;
						}
					}
				}
				break;
			}
		}

		if (status == false) {

			for (int i = 0; i < nums.length - 1; i++) {
				for (int j = i + 1; j < nums.length; j++) {

					if (nums[i] > nums[j]) {
						temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		NextPermutation obj = new NextPermutation();
		int[] nums = { 1, 3, 2 };
		obj.nextPermutation(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}
}