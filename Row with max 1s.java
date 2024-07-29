class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code 
         int n = arr.length;
        int m = arr[0].length;
        int max1sRowIndex = -1;
        int j = m - 1;  // Start from the last column

        // Iterate over each row
        for (int i = 0; i < n; i++) {
            // Move left while there are 1's
            while (j >= 0 && arr[i][j] == 1) {
                j--;
                max1sRowIndex = i;
            }
        }

        return max1sRowIndex;
    
    }
}
