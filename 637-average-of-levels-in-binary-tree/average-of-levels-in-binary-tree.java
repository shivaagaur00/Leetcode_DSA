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
        List<Double> ans=new ArrayList<>();
        if(root==null) return ans;
        List<List<Integer>> array=level(root);
        System.out.println(array);
        for(List<Integer> a:array){
            Long sum=0L;
            for(int b:a){
                sum+=b;
            }
            ans.add((double) sum / a.size());
        }
        return ans;
    }
    public List<List<Integer>> level(TreeNode root){
        List<List<Integer>> arr=new ArrayList<>();
        if(root==null) return arr;
        Queue<TreeNode> stack=new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            int size=stack.size();
            List<Integer> tempArr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=stack.poll();
                tempArr.add(temp.val);
                if(temp.left!=null) stack.add(temp.left);
                if(temp.right!=null) stack.add(temp.right);
            }
            arr.add(tempArr);
        }
        return arr;
    }
}