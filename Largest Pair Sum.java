class Solution {
    public static int pairsum(int[] arr) {
        // code here
         int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Traverse the array to find the two largest numbers
        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;  // Update second largest
                firstMax = num;        // Update largest
            } else if (num > secondMax) {
                secondMax = num;       // Update second largest
            }
        }

     
        return firstMax + secondMax;
    
    }
}
