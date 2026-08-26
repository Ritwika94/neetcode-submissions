class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(Arrays.stream(gas).sum()<Arrays.stream(cost).sum()){
            return -1;
        }
        int res =0;
        int left=0;
        for(int i=0;i< gas.length;i++){
             left += gas[i] - cost[i];
            if(left<0){
                res=i+1;
                left = 0;
            }
        }

        return res;
        
    }
}
