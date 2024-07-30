class Solution {
    private boolean isSafe(int x, int y, int n, int[][] mat, boolean[][] visited) {
        return x >= 0 && x < n && y >= 0 && y < n && mat[x][y] == 1 && !visited[x][y];
    }

    private void findPaths(int[][] mat, int n, int x, int y, boolean[][] visited, String path, ArrayList<String> allPaths) {
        if (x == n - 1 && y == n - 1) {
            allPaths.add(path);
            return;
        }

     
        visited[x][y] = true;

        if (isSafe(x + 1, y, n, mat, visited)) {
            findPaths(mat, n, x + 1, y, visited, path + 'D', allPaths);
        }

        if (isSafe(x, y - 1, n, mat, visited)) {
            findPaths(mat, n, x, y - 1, visited, path + 'L', allPaths);
        }

        if (isSafe(x, y + 1, n, mat, visited)) {
            findPaths(mat, n, x, y + 1, visited, path + 'R', allPaths);
        }

        if (isSafe(x - 1, y, n, mat, visited)) {
            findPaths(mat, n, x - 1, y, visited, path + 'U', allPaths);
        }

      
        visited[x][y] = false;
    }

    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        int n = mat.length;
        ArrayList<String> allPaths = new ArrayList<>();

        if (mat[0][0] == 0 || mat[n-1][n-1] == 0) {
            return allPaths;
        }

        boolean[][] visited = new boolean[n][n];
        findPaths(mat, n, 0, 0, visited, "", allPaths);

        Collections.sort(allPaths);
        return allPaths;
    

    }
}
