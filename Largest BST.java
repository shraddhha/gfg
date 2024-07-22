class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
    static class Info {
    boolean isBST;
    int size;
    int min;
    int max;

    Info(boolean isBST, int size, int min, int max) {
        this.isBST = isBST;
        this.size = size;
        this.min = min;
        this.max = max;
    }
    }
    static int largestBst(Node root)
    {
        // Write your code here
        return largestBSTUtil(root).size;
    }

    
    static Info largestBSTUtil(Node node) {
      
        if (node == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

      
        Info leftInfo = largestBSTUtil(node.left);
        Info rightInfo = largestBSTUtil(node.right);

    
        Info currentInfo = new Info(false, 0, node.data, node.data);

        if (leftInfo.isBST && rightInfo.isBST && leftInfo.max < node.data && node.data < rightInfo.min) {
            currentInfo.isBST = true;
            currentInfo.size = leftInfo.size + rightInfo.size + 1;
            currentInfo.min = Math.min(leftInfo.min, node.data);
            currentInfo.max = Math.max(rightInfo.max, node.data);
        } else {
            currentInfo.size = Math.max(leftInfo.size, rightInfo.size);
        }

        return currentInfo;
    }
}
     
