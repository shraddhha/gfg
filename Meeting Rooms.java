
class Solution {
    static boolean canAttend(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        // Iterate through the sorted list to check for overlapping meetings
        for (int i = 1; i < arr.length; i++) {
            // Check if the current meeting starts before the previous meeting ends
            if (arr[i][0] < arr[i - 1][1]) {
                return false;  // Overlap found
            }
        }
        return true;  // No overlap found
    
        // Your code here
    }
}
