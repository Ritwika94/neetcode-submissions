class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        
        int max=1;
        int start =0;
        HashSet<Integer> set =new HashSet();
        for(int i =0;i<nums.length;i++){
            set.add(nums[i]);
        }
        
        int arr[]=new int[set.size()];
        List<Integer> list = new ArrayList<>(set);
        for(int i =0;i<set.size();i++){
            arr[i]=list.get(i);
        }
        Arrays.sort(arr);
        for(int i =0;i<set.size();i++){
            System.out.println(arr[i]);
        }
        int i=1;
        while(i<arr.length){
            if(arr[i]!=arr[i-1]+1){
                max=Math.max(max, (i-1)-start+1);
                start =i;
                
            }
          i++;  
        }

        return Math.max(max, (i-1)-start+1);
        
    }
}
