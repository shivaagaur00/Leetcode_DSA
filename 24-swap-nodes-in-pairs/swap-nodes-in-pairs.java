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
    public ListNode swapPairs(ListNode head) {
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(head!=null){
            if(head.next!=null){
                ans.next=new ListNode(head.next.val);
                ans=ans.next;
                ans.next=new ListNode(head.val);
                head=head.next.next;
                ans=ans.next;
            }
            else{
                ans.next=new ListNode(head.val);
                ans=ans.next;
                head=head.next;
            }
        }
        return dummy.next;
    }
}