class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            if(numbers[l]+numbers[r]==target){
                System.out.println(numbers[l]+" "+numbers[r]);
                System.out.println(l+" "+r);
                return new int[]{l+1,r+1};
            }
            else if(numbers[l]+numbers[r]> target){
                r--;

            }
            else{
                l++;
            }

        }
        return new int[]{};
        
    }
}
