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
    int ans=0;
    public int goodNodes(TreeNode root) {
        func(root,Integer.MIN_VALUE);
        return ans;
    }
    public void func(TreeNode root,int max){
        if(root==null) return;
        if(root.val>=max) ans++;
        func(root.left,Math.max(max,root.val));
        func(root.right,Math.max(max,root.val));
    }
}