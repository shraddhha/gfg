class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long smallestMissing = 1;
        
      
        for (int num : arr) {
            
            if (num > smallestMissing) {
                break;
            }
          
            smallestMissing += num;
        }
        
       
        return smallestMissing;

    }
}
