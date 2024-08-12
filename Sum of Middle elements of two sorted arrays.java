
class Solution {
    public int SumofMiddleElements(int[] arr1, int[] arr2) {
        // code here
        int n = arr1.length;

        // Ensure arr1 is the smaller array to optimize binary search
        if (arr1[n-1] < arr2[0]) {
            return arr1[n/2] + arr2[0];
        }
        if (arr2[n-1] < arr1[0]) {
            return arr1[0] + arr2[n/2];
        }

        int left = 0, right = n;
        
        while (left <= right) {
            int i = (left + right) / 2;
            int j = n - i;

            if (i > 0 && arr1[i-1] > arr2[j]) {
                right = i - 1;
            } else if (i < n && arr2[j-1] > arr1[i]) {
                left = i + 1;
            } else {
                int leftMax, rightMin;

                if (i == 0) {
                    leftMax = arr2[j-1];
                } else if (j == 0) {
                    leftMax = arr1[i-1];
                } else {
                    leftMax = Math.max(arr1[i-1], arr2[j-1]);
                }

                if (i == n) {
                    rightMin = arr2[j];
                } else if (j == n) {
                    rightMin = arr1[i];
                } else {
                    rightMin = Math.min(arr1[i], arr2[j]);
                }

                return leftMax + rightMin;
            }
        }
        
        return 0; 
    }

    
}
