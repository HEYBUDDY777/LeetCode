// Last updated: 9/9/2026, 12:05:35 PM
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = {-1,-1};
        ListNode prev = head;
        ListNode curr = head.next;

        int position = 1;
        int first = -1;
        int last = -1;
        int mindistance = Integer.MAX_VALUE;

        while(curr.next!=null)
        {
            ListNode next = curr.next;
            if((prev.val<curr.val && next.val<curr.val)||(prev.val>curr.val && next.val>curr.val)){
                if(first == -1)
                {
                    first = position;
                }
                if(last != -1)
                {
                    mindistance = Math.min(mindistance,position-last);
                }
                last = position;
            }
            prev = curr;
            curr = next;
            position++;
        }
        if(first!=-1 && last!=first)
        {
            result[0] = mindistance;
            result[1] = last-first;
        }
        return result;
    }
}