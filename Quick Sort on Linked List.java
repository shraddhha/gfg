
/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }

}*/
// you have to complete this function
class GfG {
     public static Node quickSort(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: if list is empty or has a single node
        }
        // Partition the list and get the new head and tail after sorting
        return quickSortRec(head, getTail(head));
    }
   
    private static Node quickSortRec(Node head, Node end) {
        if (head == null || head == end) {
            return head;
        }

        Node[] partitionResult = partition(head, end);
        Node newHead = partitionResult[0];
        Node pivotNode = partitionResult[1];
        Node newEnd = partitionResult[2];

        // Recursively sort the left part
        if (newHead != pivotNode) {
            Node temp = newHead;
            while (temp.next != pivotNode) {
                temp = temp.next;
            }
            temp.next = null;
            newHead = quickSortRec(newHead, temp);
            temp = getTail(newHead);
            temp.next = pivotNode;
        }

        // Recursively sort the right part
        pivotNode.next = quickSortRec(pivotNode.next, newEnd);

        return newHead;
    }

  
    private static Node[] partition(Node head, Node end) {
        Node pivot = end;
        Node prev = null, cur = head, tail = pivot;
        Node newHead = null;

        while (cur != pivot) {
            if (cur.data < pivot.data) {
                if (newHead == null) {
                    newHead = cur;
                }
                prev = cur;
                cur = cur.next;
            } else {
                if (prev != null) {
                    prev.next = cur.next;
                }
                Node temp = cur.next;
                cur.next = null;
                tail.next = cur;
                tail = cur;
                cur = temp;
            }
        }

        if (newHead == null) {
            newHead = pivot;
        }

        return new Node[]{newHead, pivot, tail};
    }

    
    private static Node getTail(Node node) {
        while (node != null && node.next != null) {
            node = node.next;
        }
        return node;
    }
}
