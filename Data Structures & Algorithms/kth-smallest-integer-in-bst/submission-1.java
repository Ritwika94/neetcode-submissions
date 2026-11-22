/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int count = 0;
    boolean flag = false;
    int val=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root ==null) {
            return -1;
         } 
         kSmallest(root,k) ;  
         return val;  
    }
    public void kSmallest(TreeNode root, int k) {
         if(root ==null) {
            return;
         }  
         kSmallest(root.left, k);
         if(flag){
            return;
         }
         count++;
         if(count == k){
            System.out.println(root.val);
            flag =true;
            val =root.val;
            return ;
         }
         kSmallest(root.right,k);
         


    }
}
