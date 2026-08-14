// Last updated: 8/14/2026, 11:07:06 AM
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode c1 = list1;
        ListNode c2 = list2;
        ListNode temp = new ListNode(-1);
        ListNode dummy = temp;
        while(c1!=null && c2!=null)
        {
            if(c1.val>c2.val)
            {
                temp.next = c2;
                c2 = c2.next;
            }
            else
            {
                temp.next = c1;
                c1 = c1.next;
            }
            temp = temp.next;
        }
        if(c1!=null) temp.next = c1;
        else{
            temp.next = c2;
        }
        return dummy.next;
    }
}