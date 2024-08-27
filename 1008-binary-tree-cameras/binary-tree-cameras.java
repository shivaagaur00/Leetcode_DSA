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
    // 1 no need done
    // 2 need 
    // 3 required
    public int minCameraCover(TreeNode root) {
       int a=func(root);
       if(a==3) ans++;
       return ans;
    }
    public int func(TreeNode root){
         if(root==null) return 1;
        if(root.left==null && root.right==null) return 3;
        int left=func(root.left);
        int right=func(root.right);
        if(left==3 || right==3){
            ans++;
            return 2;
        }
        if(left==2 || right==2){
            return 1;
        }
        return 3;
    }
}