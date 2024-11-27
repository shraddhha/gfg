
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
         int n = arr.length;

      
        int j = 0; // Pointer for non-positive numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0) {
             
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        int[] positivePart = java.util.Arrays.copyOfRange(arr, j, n);
        int size = positivePart.length;

        for (int i = 0; i < size; i++) {
            int val = Math.abs(positivePart[i]);
            if (val >= 1 && val <= size) {
                int index = val - 1; // Convert to 0-based index
                if (positivePart[index] > 0) {
                    positivePart[index] = -positivePart[index]; // Mark as visited
                }
            }
        }

        for (int i = 0; i < size; i++) {
            if (positivePart[i] > 0) {
                return i + 1; 
            }
        }

     
        return size + 1;
    
    }
}
