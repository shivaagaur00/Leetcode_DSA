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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> map=new HashMap<>();
        int i=0;
        for(int a:inorder){
            map.put(a,i++);
        }
        TreeNode root=func(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
        return root;
    }
    public TreeNode func(int[] inorder,int i1,int j1,int[] postorder,int i2,int j2,Map<Integer,Integer>map){
        if(i1>j1 || i2>j2) return null;
        TreeNode root=new TreeNode(postorder[j2]);
        int mid=map.get(postorder[j2]);
        int left=mid-i1;
        root.left=func(inorder,i1,mid-1,postorder,i2,i2+left-1,map);
        root.right=func(inorder,mid+1,j1,postorder,i2+left,j2-1,map);
        return root;
    }
}