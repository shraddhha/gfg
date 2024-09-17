
class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (n == 1)
            return 0;
        
      
        Arrays.sort(arr);
        
      
        int initialDiff = arr[n - 1] - arr[0];
        
  
        int newMin = arr[0] + k;
        int newMax = arr[n - 1] - k;

        for (int i = 1; i < n; i++) {
       
            if (arr[i] - k < 0)
                continue;
     
            int currMin = Math.min(arr[0] + k, arr[i] - k);
        
            int currMax = Math.max(arr[n - 1] - k, arr[i - 1] + k);
            
         
            initialDiff = Math.min(initialDiff, currMax - currMin);
        }

        return initialDiff;
    
    }
}
