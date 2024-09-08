class Solution {
    static int minJumps(int[] arr) {
        // your code here
        int n = arr.length;
        
        // If the array has only one element, we're already at the end.
        if (n == 1) {
            return 0;
        }

        // If the first element is 0 and the array length is more than 1, we can't move forward.
        if (arr[0] == 0) {
            return -1;
        }

        int jumps = 1;  // At least one jump is needed
        int currentRange = arr[0];  // Maximum index we can reach with the current jump
        int nextRange = arr[0];  // Maximum index we can reach with the next jump

        for (int i = 1; i < n; i++) {
           
            if (i == n - 1) {
                return jumps;
            }

            nextRange = Math.max(nextRange, i + arr[i]);

      
            if (i == currentRange) {
                jumps++;
                currentRange = nextRange;

         
                if (i >= currentRange) {
                    return -1;
                }
            }
        }

     
        return -1;
    
    }
}
