class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap =new HashMap();
        for(int i =0;i< nums.length;i++){
            if (hmap.containsKey(target-nums[i])){
                int arr[]=new int[2];
                arr[0]=hmap.get(target-nums[i]);
                arr[1]=i;
                return arr;
            }
            hmap.put(nums[i],i);
        }

        return new int [0];
    }
}
