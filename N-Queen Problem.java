
class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int[] queens = new int[n];  // stores row positions of queens in each column
        solveNQueens(n, 0, queens, result);
        return result;
    }

    private void solveNQueens(int n, int col, int[] queens, ArrayList<ArrayList<Integer>> result) {
        if (col == n) {
            ArrayList<Integer> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                solution.add(queens[i] + 1);  // +1 to convert 0-based index to 1-based
            }
            result.add(solution);
            return;
        }
        
        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, queens)) {
                queens[col] = row;
                solveNQueens(n, col + 1, queens, result);
                queens[col] = 0;  // backtrack
            }
        }
    }

    private boolean isSafe(int row, int col, int[] queens) {
        for (int i = 0; i < col; i++) {
            if (queens[i] == row || 
                queens[i] - i == row - col || 
                queens[i] + i == row + col) {
                return false;
            }
        }
        return true;
    
    }
}
