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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null) return head;
        Set<Integer> arr= new HashSet<>();
        for(int a:nums) arr.add(a);
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(head!=null){
            if(!arr.contains(head.val)){
                dummy.next=new ListNode(head.val);
                dummy=dummy.next;
            }
            head=head.next;
        }
        return ans.next;
    }
}