class Solution {
    // Function to append a new node with newData at the end of a linked list
    Node[] alternatingSplitList(Node head) {
        // code here
        if (head == null) {
            return new Node[] {null, null};
        }

        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node current = head;
        int index = 0;

      
        while (current != null) {
            if (index % 2 == 0) {
              
                if (evenHead == null) {
                    evenHead = evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = evenTail.next;
                }
            } else {
             
                if (oddHead == null) {
                    oddHead = oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = oddTail.next;
                }
            }

            current = current.next; 
            index++;
        }

       
        if (evenTail != null) evenTail.next = null;
        if (oddTail != null) oddTail.next = null;

    
        return new Node[] {evenHead, oddHead};
    
    }
}
