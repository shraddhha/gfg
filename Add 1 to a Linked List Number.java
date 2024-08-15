/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        // code here.
        head = reverseList(head);

        Node current = head;
        int carry = 1; 

        while (current != null) {
            int sum = current.data + carry;
            current.data = sum % 10;
            carry = sum / 10;
            if (carry == 0) {
                break; 
            }
            if (current.next == null && carry > 0) {
                current.next = new Node(carry);
                carry = 0;
            }
            current = current.next;
        }

        return reverseList(head);
    }

    private Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

  
    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    
    }
}
