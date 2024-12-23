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
    public int minimumOperations(TreeNode root) {
        int ans=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> arr=new ArrayList<>();
            while(n-->0){
                TreeNode temp=q.poll();
                arr.add(temp.val);
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            System.out.println(arr);
            ans+=(func(arr));
            System.out.println(arr);
        }
    return ans;
    }
    public int func(List<Integer> arr){
        int count=0;
        List<Integer> sortedArr=new ArrayList<>(arr);
        Collections.sort(sortedArr);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            map.put(arr.get(i),i);
        }
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)!=sortedArr.get(i)){
                int curr=i;
                int idx=map.get(sortedArr.get(i));
                Collections.swap(arr,curr,idx);
                map.put(arr.get(i),i);
                map.put(arr.get(idx),idx);
                count++;
            }
        }
        return count;
    }
}