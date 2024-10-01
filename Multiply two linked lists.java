
class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long mod = 1000000007;  // 10^9 + 7
        
        // Initialize two numbers as 0
        long num1 = 0;
        long num2 = 0;
        
        // Traverse the first linked list and form the number
        while (first != null) {
            num1 = (num1 * 10 + first.data) % mod;
            first = first.next;
        }
        
        
        while (second != null) {
            num2 = (num2 * 10 + second.data) % mod;
            second = second.next;
        }
        
  
        return (num1 * num2) % mod;
    
    }
}
