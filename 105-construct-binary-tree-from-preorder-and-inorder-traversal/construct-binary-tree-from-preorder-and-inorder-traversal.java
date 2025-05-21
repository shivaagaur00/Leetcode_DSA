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
        return func(preorder,inorder,0,n-1,0,n-1,map);
    }
    public TreeNode func(int []pre,int []in,int pi,int pj,int ii,int ij,Map<Integer,Integer> map){
        if(pi>pj || ii>ij) return null;
        TreeNode root=new TreeNode(pre[pi]);
        int mid=map.get(pre[pi]);
        int left=mid-ii;
        root.left=func(pre,in,pi+1,pi+left,ii,mid-1,map);
        root.right=func(pre,in,pi+left+1,pj,mid+1,ij,map);
        return root;
    }
}