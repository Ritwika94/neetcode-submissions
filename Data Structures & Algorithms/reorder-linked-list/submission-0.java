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
    public void reorderList(ListNode head) {
        ListNode slow =head;
        ListNode fast =head;
        ListNode temp =head;
        ListNode dummy =head;
        ListNode prev =null;
        while(fast !=null && fast.next !=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
       
        ListNode second =reverse (slow.next);
        slow.next =null;
        while(temp !=null && second !=null){
            ListNode p1 = temp.next;
            ListNode p2 = second.next;

            temp.next = second;
            second.next = p1;

            temp = p1;
            second = p2;
        }
    }
        
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next =null;
        ListNode curr=head;
        while(curr !=null){
            next =curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;



    }
}
