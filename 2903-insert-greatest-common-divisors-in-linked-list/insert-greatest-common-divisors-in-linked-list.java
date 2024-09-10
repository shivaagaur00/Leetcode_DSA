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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null) return head;
      ListNode ans=new ListNode(head.val);
      ListNode dummy=ans;
      head=head.next;
      while(head!=null){
        int gcd=gcd(ans.val,head.val);
        ans.next=new ListNode(gcd);
        ans=ans.next;
        ans.next=new ListNode(head.val);
        ans=ans.next;
        head=head.next;
      }  
      return dummy;
    }
    public int gcd(int a,int b){
        int min=Math.min(a,b);
        for(int i=min;i>1;i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }
}