class Solution {
    public void moveZeroes(int[] nums) {
        // Approach 1 -> Get a new List and then work on that return rest;
        /*
        int n = nums.length;
        int [] res = new int[n];
        Arrays.fill(res,0);
        int pos = 0;
        for(int i=0;i<n;i++) {
            if(nums[i] != 0) {
                res[pos] = nums[i];
                pos++;
            }
        }
        for(int i=0;i<n;i++) {
            nums[i] = res[i];
        }
        */

        // Approach 2 --> We will use Two Pointers
        int i = 0;
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}