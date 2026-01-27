class Solution {
    public List<Integer> majorityElement(int[] nums) {
        /*
        Minimize maximum difference between heights
        Reverse Pairs
        Minimum operations to make array palindrome
        Minimum swaps to bring elements ≤ K together
        Array subset check
        Three-way partitioning
        Maximum Points from Cards
        Maximum Area of Cake
        Number of Zero-Filled Subarrays
        Increasing Triplet Subsequence
        */



        // Approach 2 --> Boyce Moore Voting Algorithm

         ArrayList<Integer> res = new ArrayList<>();
        // Voting Phase
        int candidate1 = 0, candidate2 = 0;
        int count1 = 0, count2 = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == candidate1) count1++;
            else if(nums[i] == candidate2) count2++;
            else if(count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num : nums) {
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;
        }
        if(count1 > nums.length/3) res.add(candidate1);
        if(count2 > nums.length/3) res.add(candidate2);

        return res;
    }
}