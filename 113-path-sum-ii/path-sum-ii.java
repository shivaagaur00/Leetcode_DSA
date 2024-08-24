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
    List<String> arr=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> lis=new ArrayList<>();
        func(root,targetSum,lis,list);
        return list;
    }
    public void func(TreeNode root,int tar,List<Integer>li,List<List<Integer>> list){
        if(root==null) return;
        li.add(root.val);
        if(root.left==null && root.right==null && (tar-root.val)==0){
            list.add(new ArrayList<>(li));
            li.remove(li.size() - 1);
            return;
        }
        func(root.left,tar-root.val,li,list);
        func(root.right,tar-root.val,li,list);
        li.remove(li.size()-1);
    }
}