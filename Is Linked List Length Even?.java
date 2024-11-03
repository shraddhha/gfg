class Solution {
    public boolean isLengthEven(Node head) {
        // code here
         boolean isEven = true; // Start with true assuming an even length if no nodes are traversed
        Node current = head;

      
        while (current != null) {
            isEven = !isEven;  
            current = current.next;
        }

        return isEven;
    }
}
