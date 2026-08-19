class Solution {
    public int removeDuplicates(int[] nums) {
       int i =0;
       int n=nums.length;
       ArrayList<Integer> list = new ArrayList();
       while(i<n-1){
        if(nums[i]==nums[i+1]){
            i++;
            continue;
        }
        else{
            System.out.println(nums[i]);
            list.add(nums[i]);
        }
        i++;
       }
       list.add(nums[n-1]);
       for(int j =0;j<list.size();j++){
        nums[j]=list.get(j);
       }

        return list.size();
        
    }
}