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
    public ListNode deleteMiddle(ListNode head) {
     int x=pos(0,head);
     if(x==0) return null;
        ListNode temp=head;
        for(int i=0;i<x-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
    public int pos(int ans,ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            ans+=1;
        }
        return ans;
    }
}