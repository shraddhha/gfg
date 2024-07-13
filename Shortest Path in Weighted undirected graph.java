class Solution {
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //  Code Here.
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new int[]{v, w});
            graph.get(v).add(new int[]{u, w});
        }

        // Dijkstra's algorithm to find the shortest path from vertex 1 to vertex n
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[1] = 0;
        pq.offer(new int[]{1, 0});

        int[] parent = new int[n + 1];
        Arrays.fill(parent, -1);

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            int d = current[1];

            if (d > dist[u]) continue;

            for (int[] neighbor : graph.get(u)) {
                int v = neighbor[0];
                int w = neighbor[1];
                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.offer(new int[]{v, dist[v]});
                    parent[v] = u;
                }
            }
        }

        // If there's no path to vertex n
        if (dist[n] == Integer.MAX_VALUE) {
            return Collections.singletonList(-1);
        }

        // Reconstruct the path
        List<Integer> path = new ArrayList<>();
        for (int at = n; at != -1; at = parent[at]) {
            path.add(at);
        }
        Collections.reverse(path);

        // Include the weight of the path
        path.add(0, dist[n]);
        return path;
    }

}
