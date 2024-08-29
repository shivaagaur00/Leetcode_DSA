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
    Map<Integer,Integer> map=new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root.left==null && root.right==null) return new int[]{root.val};
        func(root,0);
        int max=Integer.MIN_VALUE;
        for(int key:map.keySet()){
            max=Math.max(max,map.get(key));
        }
        List<Integer> arr=new ArrayList<>();
        for(int key:map.keySet()){
            if(map.get(key)==max) arr.add(key);
        }
        int[] ans=new int[arr.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=arr.get(i);
        }
        return ans;

    }
    public int func(TreeNode root,int sum){
        if(root==null) return 0;
        int a=func(root.left,sum);
        int b=func(root.right,sum);
        int total=a+b+root.val;
        map.put(total,map.getOrDefault(total,0)+1);
        return total;
    }
}