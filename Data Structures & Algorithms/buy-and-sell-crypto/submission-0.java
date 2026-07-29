class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=-1;

        for(int i=1;i<prices.length;i++){
            int currProfit= prices[i]-minPrice;
            maxProfit=Math.max(maxProfit, currProfit);

            minPrice=Math.min(minPrice, prices[i]);
        }

        return maxProfit<0 ? 0 : maxProfit;

        
   
    }
}
