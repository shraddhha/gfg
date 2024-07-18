class Solution {
    public int alternatingMaxLength(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        
        int n = arr.length;
        if (n == 1) {
            return 1;
        }
        
        int up = 1;   
        int down = 1; 
        
        int maxLength = 1;
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]) {
                up = down + 1;
            } else if (arr[i] < arr[i-1]) {
                down = up + 1;
            }
            
            maxLength = Math.max(maxLength, Math.max(up, down));
        }
        
        return maxLength;
    
        // code here
    }
}
