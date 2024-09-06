// User function Template for Java
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int[] arr) {

        // Your code here
    
        // Initialize current sum and max sum with the first element
        int currentSum = arr[0];
        int maxSum = arr[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
   
            currentSum = Math.max(arr[i], currentSum + arr[i]);

           
            maxSum = Math.max(maxSum, currentSum);
        }

    
        return maxSum;
    }
}
