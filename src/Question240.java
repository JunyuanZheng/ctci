public class Question240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int height = matrix.length, width = matrix[0].length;
        int i = 0, j = width - 1;
        while (i < height && j >= 0) {
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
