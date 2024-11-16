class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
         int n = arr.length;
        int j = 0; // Pointer to place the next non-zero element
        
        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
        
        // Fill the remaining positions with 0
        while (j < n) {
            arr[j] = 0;
            j++;
        }
    
    }
}
