/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> map=new HashMap<>();
        put_map(root,map);
        Map<TreeNode,Boolean> check=new HashMap<>();
        Queue<TreeNode> stack=new LinkedList<>();
        stack.offer(target);
        check.put(target,true);
        int dis=0;
        while(!stack.isEmpty()){
            if(dis==k) break;
            dis++;
            int n=stack.size();
            for(int i=0;i<n;i++){
                TreeNode temp=stack.poll();
                if(temp.left!=null && !check.containsKey(temp.left)){
                    stack.offer(temp.left);
                    check.put(temp.left,true);
                }
                if(temp.right!=null && !check.containsKey(temp.right)){
                    stack.offer(temp.right);
                    check.put(temp.right,true);
                }
                if(map.containsKey(temp) && !check.containsKey(map.get(temp))){
                    stack.offer(map.get(temp));
                    check.put(map.get(temp),true);
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!stack.isEmpty()){
            ans.add(stack.poll().val);
        }
        return ans;

    }
    public void put_map(TreeNode root,Map<TreeNode,TreeNode> map){
        if(root==null) return;
        if(root.left!=null) map.put(root.left,root);
        if(root.right!=null) map.put(root.right,root);
        put_map(root.left,map);
        put_map(root.right,map);
    }
}