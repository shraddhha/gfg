class Solution {
    public String printString(String s, char ch, int count) {
        // code here
        int occurrence = 0;  
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ch) {
                occurrence++;
                if (occurrence == count) {
                    if (i + 1 < length) {
                        return s.substring(i + 1);
                    } else {
                        return "";  
                    }
                }
            }
        }

       
        return "";
    
    }
}
