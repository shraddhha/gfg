
// User function Template for Java
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {

        // Your Code Here
        int totalSum = n * (n + 1) / 2;

        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        return totalSum - arraySum;
    }
}
