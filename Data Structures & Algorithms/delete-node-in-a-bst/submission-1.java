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
    public TreeNode deleteNode(TreeNode root, int key) {
        
            if(root == null){
        return null;
    }

    // deleting actual root
    if(root.val == key){

        // no child
        if(root.left == null && root.right == null){
            return null;
        }

        // both child
        else if(root.left != null && root.right != null){

            TreeNode temp = root.left;

            while(temp.right != null){
                temp = temp.right;
            }

            temp.right = root.right;

            return root.left;
        }

        // only left
        else if(root.left != null){
            return root.left;
        }

        // only right
        else{
            return root.right;
        }
    }

    delete(root,null,0,key);

    return root;
}


        
        
    
    public void delete(TreeNode root, TreeNode parent,int direction,int key ){
        if(root == null){
            return;
        }
        if(root.val ==key){
            if(root.left==null && root.right==null){
                if(direction == 1){
                    parent.left = null;
                }else{
                    parent.right = null;
                }
            }
            else if(root.left!=null&& root.right!=null){
                TreeNode temp =root.left;
                while(temp.right!=null){
                    temp = temp.right;
                }
                temp.right =root.right;
                if(direction ==+1){
                    parent.left=root.left;
                    
                }
                if(direction ==-1){
                    parent.right=root.left;
                    
                }
                return;

            }
            else if(root.right == null){

                if(direction == 1){
                    parent.left = root.left;
                }else{
                    parent.right = root.left;
                }

                return;
            }

            
            else if(root.left == null){

                if(direction == 1){
                    parent.left = root.right;
                }else{
                    parent.right = root.right;
                }

                return;
            
            }
        }
        delete(root.left, root,+1,key);
        delete(root.right, root,-1,key);
    }
}