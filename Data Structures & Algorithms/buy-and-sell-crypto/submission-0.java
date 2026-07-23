class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buyValue = prices[0];
        for (int i = 0; i < prices.length; i++) {
            buyValue = Math.min(buyValue, prices[i]);
            if (prices[i] > buyValue) {
                profit = Math.max(profit, prices[i] - buyValue);
            }
        }
        return profit;
    }
}
