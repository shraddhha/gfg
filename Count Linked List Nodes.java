class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        int count = 0;  
        Node current = head;  

     
        while (current != null) {
            count++; 
            current = current.next;  
        }

        return count;
    }
}