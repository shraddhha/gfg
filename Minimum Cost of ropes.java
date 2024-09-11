class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
        // code here
         PriorityQueue<Long> pq = new PriorityQueue<>();
        
        // Insert all ropes into the priority queue
        for (long rope : arr) {
            pq.offer(rope);
        }

        long totalCost = 0;
        
        // Keep connecting ropes until we are left with one rope
        while (pq.size() > 1) {
            // Extract two smallest ropes
            long first = pq.poll();
            long second = pq.poll();
            
            // The cost to connect them
            long cost = first + second;
            
            // Add this cost to the total cost
            totalCost += cost;
            
            // Insert the new rope back into the priority queue
            pq.offer(cost);
        }

        return totalCost;
    
    }
}
