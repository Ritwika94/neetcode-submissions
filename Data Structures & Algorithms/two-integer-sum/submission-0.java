class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap =new HashMap();
        int arr[]=new int [2];
        for(int i =0;i<nums.length;i++){
            if(hmap.containsKey(target-nums[i])){
                arr[0]=i;
                arr[1]=hmap.get(target-nums[i]);

                break;
            }

            hmap.put(nums[i] ,i);
        }

        Arrays.sort(arr);
       return arr; 
    }
}
