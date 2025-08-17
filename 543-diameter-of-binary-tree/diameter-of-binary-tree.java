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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int a=diameterOfBinaryTree(root.left);
        int b=diameterOfBinaryTree(root.right);
        int di=Math.max(Math.max(a,b),(len(root.left)+len(root.right)));
        return di;
    }
    public int len(TreeNode root){
        if(root==null) return 0;
        return Math.max(len(root.left),len(root.right))+1;
    }
}