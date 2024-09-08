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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size=0;
        ListNode temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        ListNode ans[]=new ListNode[k]; 
        if(size<k){
            int i=0;
            while(k-->0){
                if(size>0){
                    ListNode a=new ListNode(head.val);
                    head=head.next;
                    size--;
                    ans[i++]=a;
                }
                else{
                    ans[i++]=null;

                }
            }
        }
        else{
            if(size%k!=0){
                int id=size%k;
                size/=k;
                int i=0;
                while(id-->0){
                ListNode b=new ListNode(0);
                ListNode append=b;
                for(int j=0;j<=size;j++){
                    b.next=new ListNode(head.val);
                    head=head.next;
                    b=b.next;
                }
                ans[i++]=append.next;
                k--;
                }
                while(k-->0){
                   ListNode c=new ListNode(0);
                ListNode append1=c;
                for(int j=0;j<size;j++){
                    c.next=new ListNode(head.val);
                    head=head.next;
                    c=c.next;
                }
                ans[i++]=append1.next; 
                }
            }
            else{
                size/=k;
                int i=0;
                while(k-->0){
                ListNode c=new ListNode(0);
                ListNode append1=c;
                for(int j=0;j<size;j++){
                    c.next=new ListNode(head.val);
                    head=head.next;
                    c=c.next;
                }
                ans[i++]=append1.next; 
                }
            }
        }
        return ans;
    }
}