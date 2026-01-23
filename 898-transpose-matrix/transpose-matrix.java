class Solution {
    public int[][] transpose(int[][] matrix) {
       int n = matrix.length;
        int m = matrix[0].length;
        if(n == 1 && m == 1) return matrix;
        int [][] trans = new int[m][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                trans[j][i] =  matrix[i][j];
            }
        }
        return trans;
    }
}