class Solution {
    public boolean isValidBST(TreeNode root) {
        return func(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean func(TreeNode root, long min, long max) { 
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false; 
        return func(root.left, min, root.val) && func(root.right, root.val, max); 
    }
}
