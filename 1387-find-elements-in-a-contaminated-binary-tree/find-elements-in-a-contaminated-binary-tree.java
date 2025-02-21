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
class FindElements {
    TreeNode root;
    public FindElements(TreeNode root) {
        this.root=root;
    }
    
    public boolean find(int target) {
        return func(target,root,0);
    }
    public boolean func(int target,TreeNode root,int curr){
        if(curr==target) return true;
        if(root.left==null && root.right==null){
            return false;
        }
        boolean left=false;
        boolean right=false;
        if(root.right!=null){
            left=func(target,root.right,curr*2+2);
        } 
        if(root.left!=null){
            right=func(target,root.left,curr*2+1);
        }
        return left||right;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */