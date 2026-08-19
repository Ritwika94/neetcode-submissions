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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       
        if(root==null){
            return "#";
        }
        return root.val +","+ serialize(root.left)+","+serialize(root.right);
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String arr[]=data.split(",");
        int idx=0;
        return deserializeHelper(arr);
        
    }
    int idx=0;
    public TreeNode deserializeHelper(String arr[]) {
        if(arr[idx].equals("#")){
            return null;
        }
        TreeNode root=new TreeNode(Integer.parseInt(arr[idx]));
        idx++;
        root.left = deserializeHelper(arr);
        idx++;
        root.right = deserializeHelper(arr);
        return root;
        
    }
}
