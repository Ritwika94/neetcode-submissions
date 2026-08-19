/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) {
            return head;
        }     
       Node copy = null;
      Node node = head;
      while(node != null ) {
        copy = new Node(node.val);
        copy.next =node.next;
        node.next =copy;
        node = copy.next;
      } 
      Node curr=head;
      
      while(curr !=null){
        curr.next.random = curr.random ==null ? curr.random : curr.random.next;
        curr = curr.next == null ?curr.next: curr.next.next;
      }

      curr = head;
          copy=head.next;
         Node cloned =copy;
         while(curr != null && copy !=null){
            curr.next = curr.next !=null ?curr.next.next: curr.next;
            copy.next = copy.next !=null ?copy.next.next: copy.next;
            curr=curr.next;
            copy = copy.next;


         }

         return cloned;
    }
}
