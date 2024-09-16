class Solution{
    static int maxLength(String S){
        // code here
         Stack<Integer> stack = new Stack<>();
        // Initially push -1 to act as a base for valid substring calculation
        stack.push(-1);
        int maxLength = 0;

        // Traverse the string
        for (int i = 0; i < S.length(); i++) {
         
            if (S.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                 
                    stack.push(i);
                } else {
                   maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    
    }
}
