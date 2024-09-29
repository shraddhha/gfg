class Solution {
    int totalCount(int k, int[] arr) {
        // code here
        int totalCount = 0;
        
 
        for (int num : arr) {
         
            totalCount += (num + k - 1) / k;
        }
        
        return totalCount;
    
    }
}
