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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy=head;
        int size=0;
        while(dummy!=null){
            dummy=dummy.next;
            size++;
        }
        if(size<2){
            return head;
        }
        dummy=head;
        k=k%size;
        while(k-->0){
            dummy=rotate(dummy);
        }
        return dummy;
    }
    public ListNode rotate(ListNode head){
    ListNode ans=new ListNode(0);
    ListNode ans_final=ans;
    ListNode dummy=head;
    while(head.next.next!=null){
        head=head.next;
    }
    ans.next=head.next;
    head.next=null;
    ans.next.next=dummy;
    return ans_final.next;
    }
}