
class Solution {
    // Function to count the number of subarrays which adds to the given sum.
    static int subArraySum(int arr[], int tar) {
        // add your code here
         HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
        
      
        int count = 0;
        
       
        int curr_sum = 0;
        
        for (int num : arr) {
         
            curr_sum += num;
            
          
            if (curr_sum == tar) {
                count++;
            }
            
            if (prefixSumMap.containsKey(curr_sum - tar)) {
                count += prefixSumMap.get(curr_sum - tar);
            }
           
            prefixSumMap.put(curr_sum, prefixSumMap.getOrDefault(curr_sum, 0) + 1);
        }
        
        return count;
    }
}
