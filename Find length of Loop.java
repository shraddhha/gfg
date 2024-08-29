/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

// Function should return the length of the loop in LL.

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // Add your code here.
        Node slow = head;
        Node fast = head;

       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

           
            if (slow == fast) {
                return countLoopLength(slow);
            }
        }

        return 0;
    }

    private int countLoopLength(Node loopNode) {
        int count = 1;
        Node current = loopNode;

        while (current.next != loopNode) {
            current = current.next;
            count++;
        }

        return count;

    }
}
