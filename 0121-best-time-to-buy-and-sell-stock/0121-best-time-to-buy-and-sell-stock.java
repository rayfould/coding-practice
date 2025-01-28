class Solution {
    public int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;;
        int maxProfitIndex = -1;
        for(int i = 0; i < prices.length; i++)
        {
            if(prices[i] < minPrice)
            {
                minPrice = prices[i];
            }
            int profit = prices[i] - minPrice;
            if(profit > maxProfit)
            {
                maxProfit = profit;
                maxProfitIndex = i;
            }
        }
        return maxProfit;    
    }
}