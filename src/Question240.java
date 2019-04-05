public class Question240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0)
            return false;
        int i = 0;
        int j = matrix[0].length - 1;
        while (i <= matrix.length - 1 && j >= 0) {
            int value = matrix[i][j];
            if (value == target)
                return true;
            else if (value > target)
                j -= 1;
            else
                i += 1;
        }
        return false;
    }
}
