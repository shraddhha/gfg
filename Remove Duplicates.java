class Solution {
    String removeDups(String str) {
        // code here
        Set<Character> seen = new HashSet<>();
        StringBuilder result = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                result.append(c);
            }
        }
        
        return result.toString();
    
    }
}
