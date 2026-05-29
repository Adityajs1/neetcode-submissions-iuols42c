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
        //find mid
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        // now rev the second half
        ListNode sec = slow.next;
        slow.next = null;
        ListNode prev = null;

        while(sec != null){
            ListNode next = sec.next;
            sec.next = prev;
            prev = sec;
            sec = next;
        }
         // prev is head of reversed list
         ListNode first = head;
         ListNode second = prev;

         while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
         }
    }
}
