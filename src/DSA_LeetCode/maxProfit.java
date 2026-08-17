package DSA_LeetCode;

public class maxProfit {

	public static int maxProfit(int[] prices) {
		int low = prices[0];
		int profit = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < low) {
				low = prices[i];
			}
			if (prices[i] - low > profit) {
				profit = prices[i] - low;
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(prices));
	}
}