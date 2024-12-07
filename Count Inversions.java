
class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        int n = arr.length;
        int[] temp = new int[n];
        return mergeSortAndCount(arr, temp, 0, n - 1);
    }

    static int mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        int mid, invCount = 0;
        if (left < right) {
            mid = (left + right) / 2;

            invCount += mergeSortAndCount(arr, temp, left, mid);
         
            invCount += mergeSortAndCount(arr, temp, mid + 1, right);

        
            invCount += mergeAndCount(arr, temp, left, mid, right);
        }
        return invCount;
    }


    static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;    // Starting index for left subarray.
        int j = mid + 1; // Starting index for right subarray.
        int k = left;    // Starting index to be merged.
        int invCount = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1); // All remaining elements in left subarray are inversions.
            }
        }


        while (i <= mid) {
            temp[k++] = arr[i++];
        }


        while (j <= right) {
            temp[k++] = arr[j++];
        }

    
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return invCount;
    
    }
}
