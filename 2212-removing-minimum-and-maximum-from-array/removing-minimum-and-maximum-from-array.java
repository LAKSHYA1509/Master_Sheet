class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int indexMin = 0;
        int indexMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                indexMin = i;
            }
            if (nums[i] > max) {
                max = nums[i];
                indexMax = i;
            }
        }
        int front = Math.max(indexMin, indexMax) + 1;
        int back = nums.length - Math.min(indexMin, indexMax);
        int mixed = Math.min(indexMin, indexMax) + 1 + nums.length - Math.max(indexMin, indexMax);
        return Math.min(front, Math.min(back, mixed));
    }
}