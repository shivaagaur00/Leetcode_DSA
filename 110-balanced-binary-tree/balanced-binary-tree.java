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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        int a=height(root.left);
        int b=height(root.right);
        if(Math.abs(a-b)>1) return false;
        boolean aa=isBalanced(root.left);
        boolean bb=isBalanced(root.right);
        return aa&&bb;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int a=height(root.left);
        int b=height(root.right);
        return Math.max(a,b)+1;
    }
}