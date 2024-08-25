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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        if(root==null) return arr;
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            arr.add(temp.val);
            if(temp.left!=null) stack.add(temp.left);
            if(temp.right!=null) stack.add(temp.right);
        }
        Collections.reverse(arr);
        return arr;
    }
}