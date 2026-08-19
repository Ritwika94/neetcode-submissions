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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) return head;
            temp = temp.next;
        }
        ListNode newNode =reverse(head,k);
        
        head.next = reverseKGroup(temp,k);

        return newNode;
        
        
    }
    public ListNode reverse(ListNode head,int k){
        ListNode curr = head;
        ListNode prev =null;
        ListNode next =null;
        int i = 0;
        while(curr !=null && i<k){
            next =curr.next;
            curr.next =prev;
            prev =curr;
            curr =next;
            i++;

        }
        return prev;
    }
}
