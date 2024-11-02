class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        HashSet<Integer> seen = new HashSet<>();
        
     
        for (int i = 0; i < arr.length; i++) {
           
            if (seen.contains(arr[i])) {
                return true;
            }
            
         
            seen.add(arr[i]);
            
            
            if (i >= k) {
                seen.remove(arr[i - k]);
            }
        }
        
    
        return false;

    }
}
