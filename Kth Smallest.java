// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        return quickselect(arr, 0, arr.length - 1, k - 1);
    }

    private static int quickselect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pivotIndex = partition(arr, low, high);
            
       
            if (pivotIndex == k) {
                return arr[pivotIndex];
            }
      
            else if (pivotIndex > k) {
                return quickselect(arr, low, pivotIndex - 1, k);
            }
        
            else {
                return quickselect(arr, pivotIndex + 1, high, k);
            }
        }
        return Integer.MAX_VALUE;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
