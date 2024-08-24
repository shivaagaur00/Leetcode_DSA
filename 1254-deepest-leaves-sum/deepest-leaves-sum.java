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
        func(root,len,root.val);
        return max/2;
    }
    public int leng(TreeNode root){
        if(root==null) return 0;
        return Math.max(leng(root.left),leng(root.right))+1;
    }
    public void func(TreeNode root,int len,int sum){
        if(root==null && len==0){
            max+=sum;
            return;
        }
        if(root==null) return ;
        func(root.left,len-1,root.val);
        func(root.right,len-1,root.val);
    }
}