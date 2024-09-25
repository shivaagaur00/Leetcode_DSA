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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(ListNode list:lists){
            if(list!=null){
            while(list!=null){
                pq.add(list.val);
                list=list.next;
            }
            }
        }
        ListNode ans=new ListNode(0);
        ListNode dummy=ans;
        while(!pq.isEmpty()){
            ans.next=new ListNode(pq.poll());
            ans=ans.next;
        }
        return dummy.next;
    }
}