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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> arr=new ArrayList<>();
        pre(root1,arr);
        pre(root2,arr);
        Collections.sort(arr);
        return arr;
    }
    public void pre(TreeNode root,List<Integer> arr){
        if(root==null) return;
        arr.add(root.val);
        pre(root.left,arr);
        pre(root.right,arr);
    }
}