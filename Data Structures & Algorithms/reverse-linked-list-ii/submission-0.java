/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node =head;
        ListNode prev=null;
        
        for(int i =1;i<=left;i++){
            if(i==left){
                head=reverse(head,node,prev,left,right);
                break;
                
            }
            prev=node;
            node=node.next;
            
        }
        return head;
    }
    public ListNode reverse(ListNode head,ListNode node,ListNode node1,int left,int right){
        ListNode curr=node;
        ListNode prev=node1;
        ListNode next =null;
        ListNode leftNode=node;
        System.out.println(left + " "+ right);
        while(curr!=null && left<=right){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            left++;
        }
        if(node1 != null) {
            node1.next = prev;
        }
        else {
            // if reversing from head
            head = prev;
        }


        // connect reversed tail to remaining list
        leftNode.next = curr;
        return head;

    }
}