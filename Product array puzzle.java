// User function Template for Java

class Solution {
    public static long[] productExceptSelf(int nums[]) {
        // code here
        int n = nums.length;
        
        // Initialize the output array where we will store the result
        long[] productArray = new long[n];

        // Initialize left product and right product
        long leftProduct = 1;
        long rightProduct = 1;
        
        // Step 1: Fill the productArray with the left products
        for (int i = 0; i < n; i++) {
            productArray[i] = leftProduct;
            leftProduct *= nums[i];
        }
        
        // Step 2: Multiply with the right products
        for (int i = n - 1; i >= 0; i--) {
            productArray[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return productArray;
    }
}
