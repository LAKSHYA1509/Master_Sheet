class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= m * n; i++) {
            set.add(i);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int num = grid[i][j];
                map.put(num, map.getOrDefault(num, 0) + 1);
                set.remove(grid[i][j]);
            }
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                ans[0] = key;
            }
        }
        ans[1] = set.iterator().next();
        return ans;
    }
}