public class Question348 {
    class TicTacToe {
        int size;
        int[] row, column;
        int diag, antiDiag;

        /** Initialize your data structure here. */
        public TicTacToe(int n) {
            this.size = n;
            this.row = new int[n];
            this.column = new int[n];
            this.diag = 0;
            this.antiDiag = 0;
        }

        /** Player {player} makes a move at ({row}, {col}).
         @param row The row of the board.
         @param col The column of the board.
         @param player The player, can be either 1 or 2.
         @return The current winning condition, can be either:
         0: No one wins.
         1: Player 1 wins.
         2: Player 2 wins. */
        public int move(int row, int col, int player) {
            int value = player == 1 ? -1 : 1;
            int winingCondition = value * this.size;

            this.row[row] += value;
            if (this.row[row] == winingCondition)
                return player;

            this.column[col] += value;
            if (this.column[col] == winingCondition)
                return player;

            if (row == col) {
                this.diag += value;
                if (this.diag == winingCondition)
                    return player;
            }

            if (row == size - 1 - col) {
                this.antiDiag += value;
                if (this.antiDiag == winingCondition)
                    return player;
            }

            return 0;
        }
    }
}
