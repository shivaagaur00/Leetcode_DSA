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
    String s="";
    public String tree2str(TreeNode root) {
        if(root==null) return "";
        String st="("+tree2str(root.left)+")";
        String temp=tree2str(root.right);
        if(temp.length()>0) temp="("+temp+")";
        if(st.equals("()") && temp.length()==0) return ""+root.val;
        return ""+root.val+st+temp;
    }
}