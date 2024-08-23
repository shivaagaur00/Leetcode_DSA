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
    int coins=0;
    public int distributeCoins(TreeNode root) {
        int ans=func(root);
        return coins;
    }
    public int func(TreeNode root){
        if(root==null) return 0;
        int a=func(root.left);
        int b=func(root.right);
        coins+=Math.abs(a)+Math.abs(b);
        return a+b+(root.val-1);
    }
}