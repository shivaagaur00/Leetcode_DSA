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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return func(0,nums.length-1,nums);
    }
    public TreeNode func(int i,int j,int[] nums){
        if(i>j) return null;
        int max=Integer.MIN_VALUE;
        int idx=i;
        for(int id=i;id<=j;id++){
            if(max<nums[id]){
                idx=id;
                max=nums[id];
            }
        }
        TreeNode root=new TreeNode(max);
        root.left=func(i,idx-1,nums);
        root.right=func(idx+1,j,nums);
        return root;
    }
}