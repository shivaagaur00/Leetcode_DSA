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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int a:inorder){
            map.put(a,i++);
        } 
        TreeNode root=func(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    public TreeNode func(int[]preorder,int i1,int j1,int[]inorder,int i2,int j2,Map<Integer,Integer> map){
        if(i1>j1 || i2>j2) return null;
        TreeNode root=new TreeNode(preorder[i1]);
        int a=map.get(preorder[i1]);
        int left=a-i2;
        root.left=func(preorder,i1+1,i1+left,inorder,i2,a-1,map);
        root.right=func(preorder,i1+left+1,j1,inorder,a+1,j2,map);
        return root;
    }

}