class Intersect {
   
    int intersectPoint(Node head1, Node head2) {
        // code here
        if (head1 == null || head2 == null) {
            return -1;
        }
        
        Node ptr1 = head1;
        Node ptr2 = head2;

      
        while (ptr1 != ptr2) {
    
            ptr1 = (ptr1 == null) ? head2 : ptr1.next;
            ptr2 = (ptr2 == null) ? head1 : ptr2.next;
        }

      
        return (ptr1 != null) ? ptr1.data : -1;
    
    }
}
