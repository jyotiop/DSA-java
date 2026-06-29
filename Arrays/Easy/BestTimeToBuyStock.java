// LeetCode 121 - Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Approach: Greedy (track minimum buy price)
// Time: O(n) | Space: O(1)

class BestTimeToBuyStock {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyPrice < prices[i]) {
                // Calculate today's profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                // Found cheaper price → buy from here now
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
