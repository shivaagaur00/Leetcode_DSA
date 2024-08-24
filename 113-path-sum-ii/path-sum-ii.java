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
        func(root,targetSum,"");
        List<List<Integer>> ans=new ArrayList<>();
        for(String st:arr){
            String[] array=st.split(" ");
            List<Integer> lis=new ArrayList<>();
            for(String t:array){
                lis.add(Integer.parseInt(t));
            }
            ans.add(lis);
        }
        return ans;
    }
    public void func(TreeNode root,int tar,String s){
        if(root==null) return;
        if(root.left==null && root.right==null && tar-root.val==0){
            arr.add(s+root.val+" ");
            return;
        }
        func(root.left,tar-root.val,s+root.val+" ");
        func(root.right,tar-root.val,s+root.val+" ");
        return;
    }
}