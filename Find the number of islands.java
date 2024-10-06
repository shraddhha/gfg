
class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
         if (grid == null || grid.length == 0) return 0;

        int n = grid.length, m = grid[0].length;
        int islandCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {  // Found an unvisited land
                    dfs(grid, i, j, n, m);
                    islandCount++;
                }
            }
        }

        return islandCount;
    }

    // DFS function to mark all connected lands as visited.
    private void dfs(char[][] grid, int x, int y, int n, int m) {
        if (x < 0 || y < 0 || x >= n || y >= m || grid[x][y] == '0') return;

        // Mark the current cell as visited
        grid[x][y] = '0';

        // Explore all 8 directions
        dfs(grid, x + 1, y, n, m);  // Down
        dfs(grid, x - 1, y, n, m);  // Up
        dfs(grid, x, y + 1, n, m);  // Right
        dfs(grid, x, y - 1, n, m);  // Left
        dfs(grid, x + 1, y + 1, n, m);  // Bottom-right
        dfs(grid, x - 1, y - 1, n, m);  // Top-left
        dfs(grid, x - 1, y + 1, n, m);  // Top-right
        dfs(grid, x + 1, y - 1, n, m);  // Bottom-left
    }
}
