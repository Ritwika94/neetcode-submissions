class Solution {
    public boolean isPalindrome(String s) {

        String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char arr[] = s1.toCharArray();

        int j = arr.length - 1;

        for(int i = 0; i < arr.length / 2; i++) {

            if(arr[i] != arr[j]) {
                return false;
            }

            j--;
        }

        return true;
    }
}