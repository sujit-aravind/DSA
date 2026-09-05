package DSA_LeetCode;

public class ContainerWithMostWater {

	public int maxArea(int[] height) {

		int maxAreaDublicate = 0, maxArea = 0;

		int left = 0;
		int right = height.length - 1;

		while (left < right) {

			if (height[left] < height[right])
				maxAreaDublicate = ((right - left) * height[left]);
			else if (height[left] > height[right])
				maxAreaDublicate = ((right - left) * height[right]);
			else
				maxAreaDublicate = ((right - left) * height[left]);

			if (maxAreaDublicate > maxArea)
				maxArea = maxAreaDublicate;

			if (height[left] < height[right])
				left++;
			else
				right--;
		}
		return maxArea;
	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		ContainerWithMostWater obj = new ContainerWithMostWater();
		int result = obj.maxArea(height);
		System.out.println(result);
	}
}