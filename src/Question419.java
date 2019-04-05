public class Question419 {
    public int countBattleships(char[][] board) {
        int result = 0;
        if (board == null || board.length == 0)
            return 0;
        for (int i = 0; i < board.length; i += 1) {
            for (int j = 0; j < board[i].length; j += 1) {
                if (i - 1 >= 0 && board[i - 1][j] == 'X')
                    continue;
                if (j - 1 >= 0 && board[i][j - 1] == 'X')
                    continue;
                if (board[i][j] == 'X')
                    result += 1;
            }
        }
        return result;
    }
}
