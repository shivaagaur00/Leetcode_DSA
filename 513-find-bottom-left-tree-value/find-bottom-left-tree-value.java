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
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> outer=new ArrayList<>();

        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> inner=new ArrayList<>();
            while(n-->0){
                TreeNode temp=q.poll();
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
                inner.add(temp.val);
            }
            outer.add(inner);
        }  
        return outer.get(outer.size()-1).get(0);
    }
}