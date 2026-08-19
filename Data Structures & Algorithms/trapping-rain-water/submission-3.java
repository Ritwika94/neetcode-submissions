class Solution {
    public int trap(int[] height) {
        int lmax=Integer.MIN_VALUE;
        int hmax= Integer.MIN_VALUE;
        int l =0;
        int r=height.length-1;
        int res =0;
        while(l<r){
            if(height[l]<height[r]){
                if(lmax < height[l]){
                        lmax=height[l];
                        
                }
                    
                else{
                    res += lmax - height[l];
                    l++;
                }
                
            }
            else{
                if(hmax < height[r])
                    hmax=height[r];
                else{
                    res += hmax - height[r];
                    r--;
                }
                
            }
        }

        return res;
        
    }
}
