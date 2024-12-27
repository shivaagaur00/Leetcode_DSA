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
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
        return func(nums,0,n-1);
    }
    public TreeNode func(int[] nums,int i,int j){
        if(i>j) return null;
        int mid=(i+j)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=func(nums,i,mid-1);
        root.right=func(nums,mid+1,j);
        return root;
    }
}