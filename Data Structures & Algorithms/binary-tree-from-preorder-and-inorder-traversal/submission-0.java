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
    int prev=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,preorder.length-1);
        
    }

    public TreeNode build(int[] preorder, int[] inorder,int start,int end) {
        if(start> end)
        return null;
        TreeNode root =new TreeNode(preorder[prev]);
        prev++;
        if(start ==end){
            return root;
        }
        int index = getIndex(inorder,root.val,start,end);
        root.left = build(preorder,inorder, start, index -1);
         root.right =build(preorder,inorder, index +1, end);
        return root;
        
    }
    public int getIndex( int[] inorder,int root,int start,int end){
        for(int i =start;i<=end;i++){
            if(root == inorder[i]){
                return i;
            }
        }
        return -1;
    }
}
