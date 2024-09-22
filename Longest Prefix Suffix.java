
class Solution {
    int lps(String str) {
        // code here
        int n = str.length();
 
        int[] lps = new int[n];
        
        // lps[0] is always 0 as a single character cannot have a proper prefix or suffix
        lps[0] = 0;
        
        // Length of the previous longest prefix suffix
        int length = 0;
        
        // Start from the second character
        int i = 1;
        
       
        while (i < n) {
            if (str.charAt(i) == str.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    // Fall back to the previous position in LPS array
                    length = lps[length - 1];
                } else {
                    // If no prefix suffix match found, set lps[i] to 0
                    lps[i] = 0;
                    i++;
                }
            }
        }
        
      
        return lps[n - 1];
    
    }
}
