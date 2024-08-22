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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> stack=new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            int n=stack.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++){
                TreeNode temp=stack.poll();
                max=Math.max(max,temp.val);
                if(temp.left!=null) stack.add(temp.left);
                if(temp.right!=null) stack.add(temp.right);
            }
            ans.add(max);
        }
        return ans;
    }
}