class Solution {
    public List<Integer> majorityElement(int[] nums) {
        /*
        Union & Intersection of sorted arrays
        Minimize maximum difference between heights
        Factorial of large number
        Elements appearing more than n/k times
        Array subset check
        Three-way partitioning
        Minimum swaps to bring elements ≤ K together
        Minimum operations to make array palindrome
        Game of Life
        Maximum Points from Cards
        Maximum Area of Cake
        Invalid Transactions
        Range Sum Query (1D + 2D Immutable)
        Repeat & Missing Number
        Single Number
        Pow(x, n)
        Set Matrix Zeroes
        Word Search
        Reverse Pairs
        Number of Zero-Filled Subarrays
        Increasing Triplet Subsequence
        */



        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()) {
            if (map.get(key) > nums.length / 3) res.add(key);
        }
        // Approach 2 --> Boyce Moore Voting Algorithm
        return res;
    }
}