/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        func(root,arr);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Set<Integer> st=new HashSet<>();
        for(int a:arr) st.add(a);
        for(int a:st) pq.add(a);
        pq.poll();
        if(pq.isEmpty()) return -1;
        return pq.poll();
    }
    public void func(TreeNode root,List<Integer> arr){
        arr.add(root.val);
        if(root.right==null && root.left==null) return;
        if(root.left!=null) func(root.left,arr);
        if(root.right!=null) func(root.right,arr);
    }
}