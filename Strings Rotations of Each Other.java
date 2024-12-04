
class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
         if (s1.length() != s2.length()) {
            return false;
        }
        

        int[] lps = buildLPS(s2);
        int n = s1.length();
        int i = 0; // Pointer for s1
        int j = 0; // Pointer for s2
   
        while (i < 2 * n) {
            char c1 = s1.charAt(i % n); 
            if (c1 == s2.charAt(j)) {
                i++;
                j++;
                if (j == n) {
                    return true; 
                }
            } else if (j > 0) {
                j = lps[j - 1]; 
            } else {
                i++;
            }
        }
        return false;
    }

    private static int[] buildLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;
        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else if (len > 0) {
                len = lps[len - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        return lps;
    
    }
}
