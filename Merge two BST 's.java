
// User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

*/

class Solution {


    private void inorderTraversal(Node root, List<Integer> result) {
        if (root != null) {
            inorderTraversal(root.left, result);
            result.add(root.data);
            inorderTraversal(root.right, result);
        }
    }

    private List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public List<Integer> merge(Node root1, Node root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        inorderTraversal(root1, list1);
        inorderTraversal(root2, list2);

        
        return mergeSortedLists(list1, list2);
    }

    public static Node newNode(int data) {
        return new Node(data);
    }
    
}
