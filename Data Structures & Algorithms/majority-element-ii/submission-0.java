class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n1=nums.length;
        int cnt1=0;
        int cnt2 =0;
        int nums1=-1;
        int nums2=-1;
        for(int n :nums){
            if(n==nums1){
                cnt1++;
            }
            else if(n==nums2){
                cnt2++;
            }
            else if(cnt1==0){
                nums1=n;
                cnt1=1;
            }
            else if(cnt2==0){
                nums2=n;
                cnt2=1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int n:nums){
            if(n==nums1){
                cnt1++;
            }
            else if(n==nums2){
                cnt2++;
            }
        }
        List<Integer> res = new ArrayList<>();
        if (cnt1 > n1 / 3) res.add(nums1);
        if (cnt2 > n1/ 3) res.add(nums2);

        return res;


        
    }
}