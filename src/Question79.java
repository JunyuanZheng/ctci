public class Question79 {
    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null)
            return false;
        for (int i = 0; i < board.length; i += 1) {
            for (int j = 0; j < board[i].length; j += 1) {
                if (helper(board, word, 0, i, j))
                    return true;
            }
        }
        return false;
    }

    private boolean helper(char[][] board, String word, int idx, int row, int col) {
        if (idx == word.length())
            return true;
        if (row < 0 || col < 0 || row >= board.length || col >= board[row].length || board[row][col] != word.charAt(idx))
            return false;
        char c = board[row][col];
        board[row][col] = 0;
        boolean result = helper(board, word, idx + 1, row + 1, col) ||
                helper(board, word, idx + 1, row, col + 1) ||
                helper(board, word, idx + 1, row - 1, col) ||
                helper(board, word, idx + 1, row, col - 1);
        board[row][col] = c;
        return result;
    }
}
