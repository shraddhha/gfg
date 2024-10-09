class Solution {
    static Node construct(int arr[][]) {
    // Add your code here.
    int n = arr.length;
    if (n == 0) return null;

    // Create a 2D array of Node references to hold the nodes.
    Node[][] nodes = new Node[n][n];

    // Step 1: Create nodes for each element in the matrix.
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            nodes[i][j] = new Node(arr[i][j]);
        }
    }

    // Step 2: Link the nodes appropriately (right, down).
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (j < n - 1) {  // Link the current node to its right neighbor.
                nodes[i][j].right = nodes[i][j + 1];
            }
            if (i < n - 1) {  // Link the current node to its down neighbor.
                nodes[i][j].down = nodes[i + 1][j];
            }
        }
    }

    // Return the head node (top-left corner of the matrix).
    return nodes[0][0];
}
}
