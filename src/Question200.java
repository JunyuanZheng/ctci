public class Question200 {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int result = 0;
        for (int i = 0; i < grid.length; i += 1) {
            for (int j = 0; j < grid[i].length; j += 1) {
                if (grid[i][j] == '1') {
                    result += 1;
                    dfs(grid, i, j);
                }
            }
        }
        return result;
    }

    private void dfs(char[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] != '1')
            return;
        grid[row][col] = 'X';
        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }
}
