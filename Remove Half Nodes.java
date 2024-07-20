
// User function Template for Java

/*

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}

*/

class Solution {
    // Return the root of the modified tree after removing all the half nodes.
    public Node RemoveHalfNodes(Node root) {
        // Code Here
        if (root == null) {
            return null;
        }
        
        root.left = RemoveHalfNodes(root.left);
        root.right = RemoveHalfNodes(root.right);
       
        if (root.left != null && root.right == null) {
            return root.left;
        }
        
        if (root.left == null && root.right != null) {
            return root.right;
        }
       
        return root;
    }
    
    
    public void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }
    
}
