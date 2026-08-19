class Solution {
        private Map<String, Integer> dp = new HashMap<>();

    public int maxProfit(int[] prices) {
        if(prices.length ==1){
            return 0;
        }
        return dfs(0,prices, true);
        
    }
    public int dfs(int i,int[] prices, boolean buying){
        if(i>=prices.length){
            return 0;
        }
        String key = i+"-"+buying;
        if(dp.containsKey(key)){
            return dp.get(key);
        }
        int cooldown =dfs(i+1,prices,buying);
        if(buying){
            int buy = dfs(i+1,prices,false)-prices[i];
            dp.put(key, Math.max(buy, cooldown));        }
        else{
            int sell = dfs(i+2,prices,true)+prices[i];;
            dp.put(key, Math.max(sell, cooldown));        
            }
        return dp.get(key);
    }
}
