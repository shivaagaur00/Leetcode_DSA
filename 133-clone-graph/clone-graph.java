/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Node,Node> map=new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        if(map.containsKey(node)) return map.get(node);
        Node ans=new Node(node.val);
        map.put(node,ans);
        for(Node a:node.neighbors){
            ans.neighbors.add(cloneGraph(a));
        }
        return ans;
    }
}