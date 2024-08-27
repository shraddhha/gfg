
class Solution {
    public int findMaxDiff(int[] arr) {
        // code here
        int n = arr.length;
        
        // Initialize left and right smaller arrays
        int[] ls = new int[n];
        int[] rs = new int[n];
        
        // Stack to keep track of elements
        Stack<Integer> stack = new Stack<>();
        
        // Calculate left smaller elements
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
    stack.pop();
            }
            if (!stack.isEmpty()) {
                ls[i] = stack.peek();
            } else {
                ls[i] = 0;
            }
            stack.push(arr[i]);
        }
        
        // Clear stack for right smaller elements
        stack.clear();
        
        // Calculate right smaller elements
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                rs[i] = stack.peek();
            } else {
                rs[i] = 0;
            }
            stack.push(arr[i]);
        }
        
        // Calculate the maximum absolute difference
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            maxDiff = Math.max(maxDiff, Math.abs(ls[i] - rs[i]));
        }
        
        return maxDiff;
    
    }
}
