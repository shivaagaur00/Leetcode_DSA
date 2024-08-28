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
class BSTIterator {
TreeNode node;
int i=0;
List<Integer> ans=new ArrayList<>();
    public BSTIterator(TreeNode root) {
        node=root;
        if(root!=null){
    Stack<TreeNode> stack=new Stack<>();
            while(!stack.isEmpty() || root!=null){
        while(root!=null){
            stack.push(root);
            root=root.left;
        }
        TreeNode temp=stack.pop();
        ans.add(temp.val);
        root=temp.right;
    }
        }
    }
    
    public int next() {
        return ans.get(i++);
        
    }
    
    public boolean hasNext() {
        if(i>=ans.size()) return false;
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */