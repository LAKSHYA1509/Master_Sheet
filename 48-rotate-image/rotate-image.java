class Solution {
    public void rotate(int[][] matrix) {
        // Rotate Image = Transposing + Reversal of Column
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] trans = transpose(matrix);
        // We have the transpose.. Lets reverse the columns
        for (int i = 0; i < n; i++) {
            System.arraycopy(trans[i], 0, matrix[i], 0, m);
        }
        reverse(matrix);
    }

    static public void reverse(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] trans = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        return trans;
    }
}