class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product =1;
        int arr[]=new int[nums.length];
        Arrays.fill(arr,1);
        arr[0]=1;
        for(int i = 0;i<nums.length;i++){
            
              
            arr[i]*=product;
            product *=nums[i];
            System.out.println("right move :"+ product +" "+ arr[i]);

        }
        product = 1;

        for(int i =nums.length-1;i>=0;i--){
            
            arr[i]*=product;
            product *=nums[i];

             System.out.println("left move :"+ product +""+ arr[i]);
        }

        return arr;
        
    }
}  
