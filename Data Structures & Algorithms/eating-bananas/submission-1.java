class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right= Arrays.stream(piles).max().getAsInt();
        while(left<=right){
            double mid = left + (right -left)/2;
            double sum=0;
            for(int k : piles){
                sum+= Math.ceil((double)k/mid);
            }
            if(sum>h){
                left =(int)(mid+1);
            }
            else{
                right = (int)(mid-1);
            }
        }

        return left;
    }
}
