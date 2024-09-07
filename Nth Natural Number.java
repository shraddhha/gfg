
class Solution {
    long findNth(long n) {
        // code here
        long result = 0;
        long base = 1;
        
        // Process the number as base 9
        while (n > 0) {
            result += (n % 9) * base;  
            n /= 9;  
            base *= 10;  
        }
        
        return result;
    
    }
}
