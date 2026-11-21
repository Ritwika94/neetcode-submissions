class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int A[]=nums1;
    int B[]=nums2;
    if(B.length< A.length){
        int temp[]=A;
        A=B;
        B= temp;
    }
    int l=0;
    int r=A.length;
    int total=A.length+B.length;
    int half=(total+1)/2;
    while(l<=r){
        int i =(l+r)/2;
        int j=half -i;
        int Aleft = i<=0 ?Integer.MIN_VALUE : A[i-1];
        int Aright=i>A.length-1?Integer.MAX_VALUE : A[i];
        int Bleft = j<=0? Integer.MIN_VALUE : B[j-1];
        int Bright=j>B.length-1?Integer.MAX_VALUE : B[j];

        if(Aleft<=Bright && Bleft<=Aright){
            if(total %2 ==0){
                double median =(Math.max(Aleft,Bleft)+ Math.min(Aright , Bright))/2.0;
                return median;
            }
            else{
                return Math.max(Aleft,Bleft);
            }
        }
        else if(Aleft>Bright){
            r=i-1;
        }
        else{
            l=i+1;
        }
    }

    return -1;
}
}

