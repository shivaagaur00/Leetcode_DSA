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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int i=0;i<preorder.length;i++){
            root=func(root,preorder[i]);
        }
        return root;
    }
    public TreeNode func(TreeNode root,int val){
        if(root==null) return new TreeNode(val);
        if(root.val>val) root.left=func(root.left,val);
        else if(root.val<val) root.right=func(root.right,val);
        return root;
    }
}