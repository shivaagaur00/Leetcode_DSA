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
    String[] ch={"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public String smallestFromLeaf(TreeNode root) {
        func(root,"");
        Collections.sort(arr);
        return arr.get(0);
    }
    public void func(TreeNode root,String s){
        if(root.left==null && root.right==null){
            s+=ch[root.val];
            String st="";
            for(int i=s.length()-1;i>=0;i--){
                st+=s.charAt(i);
            }
            arr.add(st);
            return;
        }
        if(root.left!=null) func(root.left,s+ch[root.val]);
        if(root.right!=null) func(root.right,s+ch[root.val]);
    }
}