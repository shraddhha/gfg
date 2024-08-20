
class Solution{
     int result = 0;  // Store the maximum time needed to burn the entire tree.

    public int minTime(Node root, int target) {
        result = 0;
        calculateBurnTime(root, target);
        return result;
    }

    // Returns the distance from the target node if found, otherwise returns -1.
    private int calculateBurnTime(Node root, int target) {
        if (root == null) {
            return -1;
        }

        if (root.data == target) {
            // Start burning the subtree rooted at the target node.
            burnSubtree(root, 0);
            return 1;  
        }

        int leftDistance = calculateBurnTime(root.left, target);
        int rightDistance = calculateBurnTime(root.right, target);

        if (leftDistance != -1) {
         
            result = Math.max(result, leftDistance);
            burnSubtree(root.right, leftDistance + 1);
            return leftDistance + 1;  
        }

        if (rightDistance != -1) {
            
            result = Math.max(result, rightDistance);
            burnSubtree(root.left, rightDistance + 1);
            return rightDistance + 1; 
        }

        return -1;  
    }

    
    private void burnSubtree(Node root, int time) {
        if (root == null) {
            return;
        }

        result = Math.max(result, time);  

        burnSubtree(root.left, time + 1);
        burnSubtree(root.right, time + 1);
    }
}
