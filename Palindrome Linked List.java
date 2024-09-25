
/* Structure of class Node is
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/

class Solution {
    // Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) {
        // Your code here
         if (head == null || head.next == null) {
            return true; 
        }
        
     
        Node middle = findMiddle(head);
        
       
        Node secondHalfHead = reverse(middle);
        
       
        Node firstHalfNode = head;
        Node secondHalfNode = secondHalfHead;
        boolean isPalindrome = true;
        
        while (secondHalfNode != null) {  // Compare only the second half
            if (firstHalfNode.data != secondHalfNode.data) {
                isPalindrome = false;
                break;
            }
            firstHalfNode = firstHalfNode.next;
            secondHalfNode = secondHalfNode.next;
        }
        
        
        reverse(secondHalfHead);
        
        return isPalindrome;
    }
    
  
    Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
    
    Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    
    }
}
