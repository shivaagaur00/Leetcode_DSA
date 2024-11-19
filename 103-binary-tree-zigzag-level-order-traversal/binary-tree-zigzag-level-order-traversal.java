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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        int count=1;
        while(!queue.isEmpty()){
            List<Integer> arr=new ArrayList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
            TreeNode temp=queue.poll();
            arr.add(temp.val);
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null) queue.add(temp.right);
            }
            if(count%2==0){
                ans.add(rev(arr));
            }
            else{
                ans.add(arr);
            }
            count++;
        }
        return ans;
    }
    List<Integer> rev(List<Integer> arr){
        List<Integer> ans=new ArrayList<>();
        for(int i=arr.size()-1;i>=0;i--){
            ans.add(arr.get(i));
        }
        return ans;
    }
}