class Solution {
    public void deleteAlt(Node head) {
        // Code Here
        if (head == null) return;

        // Initialize current node as head
        Node current = head;
        
        while (current != null && current.next != null) {
            // Skip the next node (delete alternate node)
            current.next = current.next.next;
            
            // Move current to the next valid node
            current = current.next;
        }
    }
}
