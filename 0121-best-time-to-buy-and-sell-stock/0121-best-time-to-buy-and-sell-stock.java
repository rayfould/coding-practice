class Solution {
    public int maxProfit(int[] prices) 
    {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i++)
        {
            int profit = prices[i] - minPrice;
            if(prices[i] < minPrice)
            {
                minPrice = prices[i];
            }
            else if (profit > maxProfit)
            {
                maxProfit = profit;
            }
        }
        return maxProfit;    
    }
}