class Solution {
    public void gameOfLife(int [][] board) {
        //Approach we will do is space one
         int n = board.length;
        int m = board[0].length;
        int[] neighbors = {0,1,-1};
        
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < m; c++) {
                int live = 0;
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                            int nr = r + neighbors[i];
                            int nc = c + neighbors[j];

                            // Count if within boundaries and was alive in the copy
                            if ((nr >= 0 && nr < n) && (nc >= 0 && nc < m)
                                    && ((board[nr][nc] == 1) || (board[nr][nc] == 2))) {
                                live++;
                            }
                        }
                    }
                }

                // 3. Apply Rules to the ACTUAL board
                // Rule 1 & 3 (Death)
                if (board[r][c] == 1 && (live < 2 || live > 3)) {
                    board[r][c] = 2;
                }
                // Rule 4 (Reproduction)
                if (board[r][c] == 0 && live == 3) {
                    board[r][c] = 3;
                }
            }
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                board[r][c] %= 2;
            }
        }
    }
}