class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int run = 0;
        int curr = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            if (prices[i] < min) min = prices[i];
            else {
                curr += prices[i] - min;
                min = prices[i];
            }
        }
        run += curr;
        return run;
    }
}