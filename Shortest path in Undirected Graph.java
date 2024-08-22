
class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        // Add edges to the graph
        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
            graph.get(v).add(u); // Since the graph is undirected
        }
        
        // Step 2: Initialize distance array
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[src] = 0; // Distance from src to src is 0
        
        // Step 3: Perform BFS
        Queue<Integer> queue = new LinkedList<>();
        queue.add(src);
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            
            // Explore all neighbors of the current node
            for (int neighbor : graph.get(node)) {
                if (dist[neighbor] == -1) { // If neighbor hasn't been visited
                    dist[neighbor] = dist[node] + 1;
                    queue.add(neighbor);
                }
            }
        }
        
        return dist;
    
    }
}
