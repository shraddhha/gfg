class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int k, int arr[]) {
        // Your code here
        ArrayList<Integer> result = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Remove elements out of the current window
            if (!deque.isEmpty() && deque.peek() == i - k) {
                deque.poll();
            }
            
            // Remove elements smaller than the current element from the deque
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            
            // Add the current element's index to the deque
            deque.offer(i);
            
            // Start adding results to the list once we have processed the first window of size k
            if (i >= k - 1) {
                result.add(arr[deque.peek()]);  // The element at the front is the max of the window
            }
        }
        
        return result;
    
    
    }
}
