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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> arr=new ArrayList<>();
        if(root==null) return arr;
        Queue<TreeNode> stack=new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            int size=stack.size();
            List<Integer> tempArr=new ArrayList<>();
            Long sum=0L;
            for(int i=0;i<size;i++){
                TreeNode temp=stack.poll();
                sum+=(temp.val);
                if(temp.left!=null) stack.add(temp.left);
                if(temp.right!=null) stack.add(temp.right);
            }
            arr.add((double)sum/size);
        }
        return arr;
    }
}