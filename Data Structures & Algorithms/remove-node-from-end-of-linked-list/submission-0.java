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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count =0;
        ListNode node =head;
        while(node !=null){
            count ++;
            node =node.next;
        }
        if(count-n ==0 ){
            return head.next;
        }
        node =head;
        ListNode prev =head;
        int i =0;
        while(i<count -n){
            prev =node;
            node = node.next;
            i++;
        }
        if(node !=null){
            prev.next = node.next;
        }
        return head;


    }
}
