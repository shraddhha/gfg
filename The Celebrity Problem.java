
class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
       
        int potentialCelebrity = 0;
        for (int i = 1; i < n; i++) {
            if (mat[potentialCelebrity][i] == 1) {
                potentialCelebrity = i;
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (i != potentialCelebrity) {
                if (mat[potentialCelebrity][i] == 1 || mat[i][potentialCelebrity] == 0) {
                    return -1; 
                }
            }
        }
        
        return potentialCelebrity;
    
    }
}
