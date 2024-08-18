class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int totalSum = 0;
        
    
        for (int num : arr) {
            totalSum += num;
        }
        
        // If the total sum is odd, we can't split it into two equal parts
        if (totalSum % 2 != 0) {
            return false;
        }
        
        int leftSum = 0;
        int targetSum = totalSum / 2;
        
        for (int num : arr) {
            leftSum += num;
            
            if (leftSum == targetSum) {
                return true;
            }
        }
        
        
        return false;
    }
}
