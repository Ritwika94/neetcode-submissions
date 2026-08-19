class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m=nums2.length;
        int arr[]=new int[n+m];
        int i =0;
        int j=0;
        int k=0;
        while(i<n &&  j<m){
            if(nums1[i] < nums2[j]) {
    arr[k++] = nums1[i++];
}    else {
    arr[k++] = nums2[j++];
}
            
        }
        while(i<n){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        int p =(n+m)/2;
        if((n+m)%2 ==0){
            
            return (arr[p]+arr[p-1])/2.0;
        }
        else{
            return arr[p];
        }
    }
}
