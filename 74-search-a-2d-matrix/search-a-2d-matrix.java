class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int n = matrix.length;
        int m = matrix[0].length;
        
        // This is linear Solution which is O(n) and very good but we can do better if we know binary search
       for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               if(matrix[i][j] == target) return true;
           }
       }
        
        // Now we shall do binary search here 
        return false;
    }
}