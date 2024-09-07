/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> stack=new LinkedList<>();
        stack.add(root);
        while(!stack.isEmpty()){
            int n=stack.size();
            for(int i=0;i<n;i++){
                Node temp=stack.poll();
                if(i==(n-1)) temp.next=null;
                else temp.next=stack.peek(); 
                if(temp.left!=null) stack.add(temp.left);
                if(temp.right!=null) stack.add(temp.right);
            }
        }
        return root;
    }
}