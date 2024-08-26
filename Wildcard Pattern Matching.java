
class Solution {
    public int wildCard(String pattern, String str) {
        // Your code goes here
        int n = pattern.length();
        int m = str.length();
        
        // Create a DP table with (n+1) x (m+1) dimensions
        boolean[][] dp = new boolean[n + 1][m + 1];
        
        // Base conditions
        dp[0][0] = true;  // Empty pattern matches empty string
        
        // Handle patterns with leading '*'
        for (int i = 1; i <= n; i++) {
            if (pattern.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                char pChar = pattern.charAt(i - 1);
                char sChar = str.charAt(j - 1);
                
                if (pChar == sChar || pChar == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (pChar == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        
        // The result is the bottom-right corner of the table
        return dp[n][m] ? 1 : 0;

    }
}
