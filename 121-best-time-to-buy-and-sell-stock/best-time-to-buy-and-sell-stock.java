class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int curr = 0;
        int min = Integer.MAX_VALUE;
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            curr = prices[i];
            min = Math.min(min, curr);
            maxProfit = Math.max(maxProfit, prices[i] - min);
        }
        return maxProfit;
    }
}