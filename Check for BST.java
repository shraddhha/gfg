
class Solution {
    // Function to check whether a Binary Tree is BST or not.
    private Integer prev = null;
    boolean isBST(Node root) {
        // code here.
         
        return isBSTUtil(root);
    }

    private boolean isBSTUtil(Node node) {
        if (node == null) {
            return true;
        }

       
        if (!isBSTUtil(node.left)) {
            return false;
        }

        if (prev != null && node.data <= prev) {
            return false;
        }
        prev = node.data;

 
        return isBSTUtil(node.right);

        
    }
}
