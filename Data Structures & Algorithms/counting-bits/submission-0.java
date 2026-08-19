class Solution {
   
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        
        for(int i =0;i<=n;i++){
            countB(i,i,arr);
        }
        
        return arr;
        
    }
    public void countB(int n,int i,int [] arr) {
        int count = 0;
        while(n != 0){
            if((n & 1)==1){
                System.out.println(count);
            count++;
            
        }
        n=n>>1;
        }
        
        arr[i]=count;
    }

}
