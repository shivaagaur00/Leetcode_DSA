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
        int n=preorder.length;
        for(int i=0;i<n;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=new TreeNode();
        return func(map,preorder,0,n-1,inorder,0,n-1);
    }
    public TreeNode func(Map<Integer,Integer> map,int[] pre,int pi,int pj,int in[],int ii,int ij){
        if(pi>pj || ii>ij) return null;
        TreeNode root=new TreeNode(pre[pi]);
        int id=map.get(pre[pi]);
        int x=id-ii;
        root.left=func(map,pre,pi+1,pi+x,in,ii,ii+x-1);
        root.right=func(map,pre,pi+x+1,pj,in,id+1,ij);
        return root;
    }
}