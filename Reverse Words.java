

class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        // code here
        String[] words = str.split("\\.");
        
       
        int left = 0, right = words.length - 1;
        while (left < right) {
          
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        
        return String.join(".", words);
    
    }
}
