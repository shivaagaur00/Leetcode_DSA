class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }
        flattenNode(head);
        return head;
    }
    public Node flattenNode(Node node) {
        Node current = node;
        Node tail = node; 
        while (current != null) {
            if (current.child != null) {
                Node child = current.child;
                current.child = null;
                Node childTail = flattenNode(child);
                childTail.next = current.next;
                if (current.next != null) {
                    current.next.prev = childTail;
                }
                current.next = child;
                child.prev = current;
                tail = childTail;
            }
            current = current.next;
            if (current != null) {
                tail = current; 
            }
        }
        
        return tail;
    }
}