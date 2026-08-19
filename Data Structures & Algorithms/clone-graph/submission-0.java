/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        Map<Node, Node> oldtonew=new HashMap();
        return dfs(oldtonew,node);
        
    }

    public Node dfs(Map<Node, Node> hmap,Node node) {
        if (node==null){
            return null;
        }
        if(hmap.containsKey(node)){
            return hmap.get(node);
        }
        Node n = new Node(node.val);
        hmap.put(node,n);
        for(Node c : node.neighbors){
            n.neighbors.add(dfs(hmap,c));
        }

        return n;
            
    
        
    }
}