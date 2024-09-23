class Solve {
    int[] findTwoElement(int arr[]) {
        // code here
         int n = arr.length;
        int repeating = -1;
        int missing = -1;

        // Step 1: Mark visited indices by negating the values
        for (int i = 0; i < n; i++) {
            int absValue = Math.abs(arr[i]);
            if (arr[absValue - 1] < 0) {
                repeating = absValue; 
            } else {
                arr[absValue - 1] = -arr[absValue - 1];  
            }
        }

    
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;  
            }
        }

        return new int[]{repeating, missing};
    }
}
