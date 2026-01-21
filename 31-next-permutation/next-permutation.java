class Solution {
    public void nextPermutation(int[] nums) {
      int n = nums.length;
        int breakPoint = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) { // Matlab right ke saare ascending hi honge
                breakPoint = i;
                break;
            }
        }
        if (breakPoint != -1) {
            for (int i = n - 1; i >= breakPoint; i--) {
                if (nums[i] > nums[breakPoint]) {
                    int temp = nums[i];
                    nums[i] = nums[breakPoint];
                    nums[breakPoint] = temp;
                    break;
                }
            }
        }
        reverse(nums, breakPoint + 1, n - 1);
    }
    static public void reverse(int[] nums, int l, int r) {
        int n = nums.length;
        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}