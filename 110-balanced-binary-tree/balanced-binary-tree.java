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
    boolean result=true;
    public boolean isBalanced(TreeNode root) {
        func(root);
        return result;
    }
    public int func(TreeNode root){
        if(root==null) return 0;
        int a=func(root.left);
        int b=func(root.right);
        if(Math.abs(a-b)>1) result=false;
        return Math.max(a,b)+1;
    }
}