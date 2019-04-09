public class Question130 {
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0)
            return;
        for (int i = 0; i < board.length; i += 1) {
            if (board[i][0] == 'O')
                dfs(board, i, 0);
            if (board[i][board[i].length - 1] == 'O')
                dfs(board, i, board[i].length - 1);
        }

        for (int i = 0; i < board[0].length; i += 1) {
            if (board[0][i] == 'O')
                dfs(board, 0, i);
            if (board[board.length - 1][i] == 'O')
                dfs(board, board.length - 1, i);
        }
        for (int i = 0; i < board.length; i += 1) {
            for (int j = 0; j < board[i].length; j += 1) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == '1')
                    board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {
        if (row < 0 || col < 0 || row >= board.length || col >= board[row].length || board[row][col] != 'O')
            return;
        board[row][col] = '1';
        dfs(board, row + 1, col);
        dfs(board, row - 1, col);
        dfs(board, row, col + 1);
        dfs(board, row, col - 1);
    }
}
