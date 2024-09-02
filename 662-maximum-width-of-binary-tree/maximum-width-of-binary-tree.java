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
    public int widthOfBinaryTree(TreeNode root) {
      int ans=0;
      Queue<pair> stack=new LinkedList<>();
      stack.offer(new pair(root,0));
      while(!stack.isEmpty()){
        int n=stack.size();
        int inc=stack.peek().id;
        int first=0,last=0;
        for(int i=0;i<n;i++){
            pair a=stack.poll();
            int curr=a.id-inc;
            if(i==0) first=curr;
            else if(i==n-1) last=curr;
            if(a.node.left!=null) stack.offer(new pair(a.node.left,2*curr+1));
            if(a.node.right!=null) stack.offer(new pair(a.node.right,2*curr+2));
        }
        ans=Math.max(ans,(last-first)+1);
      }
      return ans;  
    }
}
class pair{
    TreeNode node;
    int id;
    pair(TreeNode root,int idx ){
        node=root;
        id=idx;
    }
}