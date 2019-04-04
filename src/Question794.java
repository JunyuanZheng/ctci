public class Question794 {
    public boolean validTicTacToe(String[] board) {
        int turns = 0;
        boolean xwin = false;
        boolean owin = false;
        int[] rows = new int[3];
        int[] cols = new int[3];
        int diag = 0;
        int antidiag = 0;

        for (int i = 0; i < 3; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                if (board[i].charAt(j) == 'X') {
                    turns += 1;
                    rows[i]++; cols[j]++;
                    if (i == j) diag++;
                    if (i + j == 2) antidiag++;
                } else if (board[i].charAt(j) == 'O')  {
                    turns -= 1;
                    rows[i]--; cols[j]--;
                    if (i == j) diag--;
                    if (i + j == 2) antidiag--;
                }
            }
        }

        xwin = rows[0] == 3 || rows[1] == 3 || rows[2] == 3 || cols[0] == 3 || cols[1] == 3 || cols[2] == 3 || diag == 3 || antidiag == 3;
        owin = rows[0] == -3 || rows[1] == -3 || rows[2] == -3 || cols[0] == -3 || cols[1] == -3 || cols[2] == -3 || diag == -3 || antidiag == -3;

        return (!xwin || turns != 0) && (!owin || turns != 1) && (!xwin || !owin) && turns >= 0 && turns <= 1;

    }
}
