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
    public int findBottomLeftValue(TreeNode root) {
        if(root.left==null && root.right==null) return root.val;
        Queue<TreeNode> stack=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            int n=stack.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=stack.poll();
                arr.add(node.val);
                if(node.left!=null) stack.add(node.left);
                if(node.right!=null) stack.add(node.right);
            }
            list.add(arr);
        }
        return list.get(list.size()-1).get(0);
    }
}