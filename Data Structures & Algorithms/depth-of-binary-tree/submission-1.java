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
    int max =-1;
    public int maxDepth(TreeNode root) {
        if(root == null){
            System.out.println("null");
            return 0;
        }
        depth(root,1);
        return max;
    }
    public void depth(TreeNode root,int level) {
        if(root==null){
            return;
        }
        if(max< level){
                max =level;
            }
        
        depth(root.left,level+1);
        depth(root.right,level+1);

    }
}
