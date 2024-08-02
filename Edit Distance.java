
class Solution {
    public int editDistance(String str1, String str2) {
        // Code here
        int m = str1.length();
        int n = str2.length();
        
        
        int[][] dp = new int[m + 1][n + 1];
        
     
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                
                // If first string is empty, only option is to insert all characters of second string
                if (i == 0) {
                    dp[i][j] = j;  // Min. operations = j
                }
                
                // If second string is empty, only option is to remove all characters of first string
                else if (j == 0) {
                    dp[i][j] = i;  // Min. operations = i
                }
                
               
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                
                
                else {
                    dp[i][j] = 1 + Math.min(dp[i][j - 1],     
                                            Math.min(dp[i - 1][j],      
                                                     dp[i - 1][j - 1])); 
                }
            }
        }
        
        return dp[m][n];

    }
}
