class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();
        boolean[] seen = new boolean[n + 1];

        for (int num : nums) {
            if (seen[num]) res.add(num);
            else seen[num] = true;
        }
        return res;
    }
}