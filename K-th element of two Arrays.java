
class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int n = arr1.length;
        int m = arr2.length;

        
        if (n > m) {
            return kthElement(k, arr2, arr1);
        }

        int low = Math.max(0, k - m), high = Math.min(k, n);

        while (low <= high) {
            int i = (low + high) / 2;
            int j = k - i;

            int arr1Left = (i > 0) ? arr1[i - 1] : Integer.MIN_VALUE;
            int arr1Right = (i < n) ? arr1[i] : Integer.MAX_VALUE;
            int arr2Left = (j > 0) ? arr2[j - 1] : Integer.MIN_VALUE;
            int arr2Right = (j < m) ? arr2[j] : Integer.MAX_VALUE;

            if (arr1Left <= arr2Right && arr2Left <= arr1Right) {
                return Math.max(arr1Left, arr2Left);
            } else if (arr1Left > arr2Right) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }

        return -1;
    
    }
}
