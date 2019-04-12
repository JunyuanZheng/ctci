public class Question48 {
    public void rotate(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return;
        int size = matrix.length;

        for (int i = 0; i < size / 2; i += 1) {
            int[] tmp = matrix[i];
            matrix[i] = matrix[size - 1 - i];
            matrix[size - 1 - i] = tmp;
        }
        for (int i = 0; i < size; i += 1) {
            for (int j = i + 1; j < size; j += 1) {
                int value = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = value;
            }
        }
    }
}
