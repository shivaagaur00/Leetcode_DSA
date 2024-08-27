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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> stack=new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            List<Integer> arr=new ArrayList<>();
            int n=stack.size();
            for(int i=0;i<n;i++){
                TreeNode temp=stack.poll();
                if(temp.left!=null) stack.add(temp.left);
                if(temp.right!=null) stack.add(temp.right);
                arr.add(temp.val);
            }
            ans.add(arr.get(arr.size()-1));
        }
        return ans;
    }
}