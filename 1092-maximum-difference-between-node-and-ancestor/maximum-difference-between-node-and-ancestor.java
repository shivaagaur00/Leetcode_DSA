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
    int max=0;
    public int maxAncestorDiff(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        max_func(root,arr);
        return max;
    }
    public void max_func(TreeNode root,List<Integer> list){
        if(root==null) return;
        for(int a:list){
            max=Math.max(max,Math.abs(a-root.val));
        }
        list.add(root.val);
        max_func(root.left,list);
        max_func(root.right,list);
        list.remove(list.size()-1);
    }

}