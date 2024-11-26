class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int n = arr.length;

        int maxNormal = kadane(arr);

        if (maxNormal < 0) {
            return maxNormal;
        }

        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
      
            arr[i] = -arr[i];
        }


        int minSubarraySum = -kadane(arr);


        int maxCircular = totalSum - minSubarraySum;


        return Math.max(maxNormal, maxCircular);
    }

    
    private int kadane(int arr[]) {
        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    
    }
}
