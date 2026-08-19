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
    int count =0;
    int val =0;
    public int kthSmallest(TreeNode root, int k) {
        findSmallest(root,k);
        return val;
        
    }
    public void findSmallest(TreeNode root, int k) {
        if(root == null){
            return;
        }
        findSmallest(root.left,k);
        count++;
        if(count ==k){
            val = root.val;
            return;
        }
        
        findSmallest(root.right,k);
        


        
    }
}
