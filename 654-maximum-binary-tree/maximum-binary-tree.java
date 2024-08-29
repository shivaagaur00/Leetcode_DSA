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
        return func(nums,0,nums.length-1);
    }
    public TreeNode func(int[] nums,int i,int j){
        if(i>j) return null;
        int max=Integer.MIN_VALUE;
        int k=i;
        for(int id=i;id<=j;id++){
            if(max<nums[id]){
                max=nums[id];
                k=id;
            }
        }
        TreeNode node=new TreeNode(max);
        System.out.println(max);
        node.left=func(nums,i,k-1);
        node.right=func(nums,k+1,j);
        return node;
    }
}