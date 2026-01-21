class Solution {
    public int[] twoSum(int[] nums, int target) {
         int n = nums.length;
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < n; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                if (i != map.get(x)) {
                    res[0] = map.get(x);
                    res[1] = i;
                }
            }
        }
        return res;
    }
}