package DSA_LeetCode;

import java.util.Arrays;

public class FinalPrices {
	public int[] finalPrices(int[] prices) {
		int[] arr = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			boolean status = false;
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[i] >= prices[j]) {
					arr[i] = prices[i] - prices[j];
					status = true;
					break;
				}
			}
			if (status == false)
				arr[i] = prices[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		FinalPrices obj = new FinalPrices();
		int[] prices = { 8, 4, 6, 2, 3 };
		int[] result = obj.finalPrices(prices);
		System.out.println(Arrays.toString(result));
		// Expected output: [4, 2, 4, 2, 3]
	}
}