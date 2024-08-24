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
    int max=0;
    public int deepestLeavesSum(TreeNode root) {
        int len=leng(root);
        int ans=func(root,len,root.val);
        return max/2;
    }
    public int leng(TreeNode root){
        if(root==null) return 0;
        int a=leng(root.left);
        int b=leng(root.right);
        return Math.max(a,b)+1;
    }
    public int func(TreeNode root,int len,int sum){
        if(root==null && len==0){
            max+=sum;
        }
        if(root==null) return 0;
        int a=func(root.left,len-1,root.val);
        int b=func(root.right,len-1,root.val);
        return 0;
    }
}