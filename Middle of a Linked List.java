
/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        // Your code here.
        if (head == null) {
            return -1;  // return -1 or throw an exception based on your requirements
        }

        // Initialize slow and fast pointers
        Node slow = head;
        Node fast = head;

       
        while (fast != null && fast.next != null) {
            slow = slow.next;     
            fast = fast.next.next;  
        }

      
        return slow.data;
    }
}
