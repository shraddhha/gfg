class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>();
        
       
        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
        
            if (ch == '{' || ch == '(' || ch == '[') {
                stack.push(ch);
            }
     
            else if (ch == '}' || ch == ')' || ch == ']') {
             
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }
        
        
        return stack.isEmpty();
    }

    // Helper function to check if two brackets form a matching pair.
    static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    
    }
}
