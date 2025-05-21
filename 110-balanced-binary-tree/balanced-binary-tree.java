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
        pair p=func(root);
        if(p.flag) return true;
        return false;
    }
    public pair func(TreeNode root){
        if(root==null) return new pair(true,0);
        pair a=func(root.left);
        pair b=func(root.right);
        if(!a.flag || !b.flag || Math.abs(a.len-b.len)>1) return new pair(false,Math.max(a.len,b.len)+1);
        return new pair(true,Math.max(a.len,b.len)+1);
    }
}
class pair{
    boolean flag;
    int len;
    pair(boolean flag,int len){
        this.len=len;
        this.flag=flag;
    }
}