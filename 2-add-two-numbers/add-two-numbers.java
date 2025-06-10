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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rev1=l1;
        ListNode rev2=l2;
        // prin(rev1);
        // System.out.println();
        // prin(rev2);
        int carry=0;
        ListNode ans=new ListNode(0);
        ListNode final_ans=ans;
        while(rev1!=null || rev2!=null){
            int sum=carry;
            if(rev1!=null) {
                sum+=rev1.val;
                rev1=rev1.next;
            }
            if(rev2!=null){
            sum+=rev2.val;
            rev2=rev2.next;
            }
            ListNode a=new ListNode(sum%10);
            ans.next=a;
            ans=ans.next;
            carry=sum/10;
        }
        if(carry!=0){
            ListNode a=new ListNode(carry);
            ans.next=a;
            ans=ans.next;
        }
        return final_ans.next;
    }
}