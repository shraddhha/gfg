class Solution {
    public int minimizeCost(int k, int arr[]) {
        // code here
         int n = arr.length;
        int[] dp = new int[n]; 
      
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        
        dp[0] = 0;
        
      
        for (int i = 0; i < n; i++) {
         
            for (int j = i + 1; j <= i + k && j < n; j++) {
                dp[j] = Math.min(dp[j], dp[i] + Math.abs(arr[i] - arr[j]));
            }
        }
       
        return dp[n - 1];
    }
}

