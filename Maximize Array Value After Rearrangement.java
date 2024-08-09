

class Solution {

    int Maximize(int arr[]) {
        // Complete the function
         int MOD = 1000000007;
       
        Arrays.sort(arr);
        
        long maxValue = 0; 
        for (int i = 0; i < arr.length; i++) {
            
            maxValue = (maxValue + (long) arr[i] * i) % MOD;
        }
        
        
        return (int) maxValue;
    }
}
