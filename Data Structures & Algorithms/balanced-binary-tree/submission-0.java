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
    boolean isBalanced = true;
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;

        isBalance(root);
        return isBalanced;
        
    }
    public int isBalance(TreeNode root) {
        if(root==null)
        return 0;
         int lh = isBalance (root.left);
         int rh = isBalance (root.right);
         if(Math.abs(lh-rh)>1){
            isBalanced =false;
         }

       return(1+ Math.max(lh,rh));
        
    }
}
