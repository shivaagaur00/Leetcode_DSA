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
        int n=lists.length;
        if(lists.length==0) return null;
        ListNode ans=lists[0];
        ListNode temp=ans;
        for(int i=1;i<n;i++){
            ans=mergeList(ans,lists[i]);
        }
        return ans;
    }
    public ListNode mergeList(ListNode root1,ListNode root2){
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(root1!=null && root2!=null){
            if(root1.val<root2.val){
                ans.next=new ListNode(root1.val);
                ans=ans.next;
                root1=root1.next;
            }
            else{
                ans.next=new ListNode(root2.val);
                ans=ans.next;
                root2=root2.next;
            }
        }
        if(root1!=null){
            ans.next=root1;
        }
        if(root2!=null){
            ans.next=root2;
        }
        return dummy.next;
    }
}