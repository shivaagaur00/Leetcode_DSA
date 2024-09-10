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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        return fun(root,n,x);
    }
    public boolean fun(TreeNode root,int n,int x){
        if(root==null) return false;
        if(root.val==x){
            int l =height(root.left);
            int r=height(root.right);
            if(l>n/2 || r>n/2 ||n-l-r-1 > n/2) return true;
        }
        boolean l=fun(root.left,n,x);
        boolean r=fun(root.right,n,x);
        return l||r;
    }
    public int  height(TreeNode root){
        if(root== null ){
            return 0;
        }
        int l = height(root.left);
        int r= height(root.right);
        return 1+ l+r;
    }
}