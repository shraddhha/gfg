
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
         int n = arr.length;
        int maxProduct = arr[0];  
        int currentMax = arr[0]; 
        int currentMin = arr[0];
        
       
        for (int i = 1; i < n; i++) {
            int num = arr[i];
            
            // If the number is negative, swap currentMax and currentMin
            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }
            
         
            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);
            
           
            maxProduct = Math.max(maxProduct, currentMax);
        }
        
        return maxProduct;
    }
}
