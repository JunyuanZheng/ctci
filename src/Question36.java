import java.util.HashSet;
import java.util.Set;

public class Question36 {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < 9; i += 1) {
            for (int j = 0; j < 9; j += 1) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!set.add(b + i) || !set.add(j + b) || !set.add(i/3 + b + j/3))
                        return false;
                }
            }
        }
        return true;
    }
}
