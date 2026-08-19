class Solution {
    public int maxProfit(int[] prices) {
        int minprice =prices[0];
        int profit = 0;
        for(int i =0;i<prices.length;i++){
            profit =Math.max(profit, prices[i]-minprice) ;
            minprice = Math.min(minprice, prices[i]);
        }

        return profit;
        
    }
}
