class Solution {
    public void moveZeroes(int[] nums) {
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
    }
}