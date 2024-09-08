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
    public int averageOfSubtree(TreeNode root) {
        if(root==null) return 0;
        int sum=func(root);
        int count=height(root);
        if(sum/count==root.val) ans++;
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return ans;
    }
    public int func(TreeNode root){
        if(root==null) return 0;
        return root.val+func(root.left)+func(root.right);
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        return height(root.left)+height(root.right)+1;
    }
}