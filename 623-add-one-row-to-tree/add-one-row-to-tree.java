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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {    
        if(depth==1){
            TreeNode temp=new TreeNode(val);
            temp.left=root;
            return temp;
        }
        func(root,val,depth,1);
        return root;
    }
    public void func(TreeNode tree,int val,int depth,int i){
        if(tree==null) return;
        if(i==depth-1){
            TreeNode templeft=tree.left;
            TreeNode tempright=tree.right;
            tree.left=new TreeNode(val);
            tree.right=new TreeNode(val);
            tree.left.left=templeft;
            tree.right.right=tempright;
            return;
        }
        func(tree.left,val,depth,i+1);
        func(tree.right,val,depth,i+1);
        return ;
    }

}