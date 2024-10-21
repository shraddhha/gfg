import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    
      static final int MOD = 1000000007;  

    public static int countgroup(int arr[]) {
        int n = arr.length;
        
        
        int totalXor = 0;
        for (int num : arr) {
            totalXor ^= num;
        }
        
  
        if (totalXor != 0) {
            return 0;
        }
        

        return (modPow(2, n - 1, MOD) - 1 + MOD) % MOD;
    }

    private static int modPow(int base, int exp, int mod) {
        int result = 1;
        base = base % mod;
        
        while (exp > 0) {
         
            if ((exp & 1) == 1) {
                result = (int)((long)result * base % mod);
            }
   
            base = (int)((long)base * base % mod);
            exp >>= 1;  // Divide exp by 2
        }
        
        return result;
    }

}
