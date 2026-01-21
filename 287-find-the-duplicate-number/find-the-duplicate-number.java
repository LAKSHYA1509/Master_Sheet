class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        // 4 Approaches We will do in this question

        // Approach 1 --> HashMap // O(n)

        //        HashMap<Integer,Integer> map = new HashMap<>();
        //        for(int i=0;i<n;i++) {
        //            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        //        if(map.get(nums[i])>1) return nums[i];
        //        }
        // Approach 2 --> Sorting O(n logn)
        //
        //        Arrays.sort(nums);
        //        for(int i=0;i<n;i++) {
        //            if(nums[i]==nums[i+1]) return nums[i];
        //        }

        // Approach 3 --> HashSet O(n)

        //        HashSet<Integer> set = new HashSet<>();
        //        for(int i=0;i<n;i++) {
        //            if(set.contains(nums[i])) return nums[i];
        //        set.add(nums[i]);
        //        }

        // Approach 4 --> Tortoise And Hare algo (Very Important)
        // The above approaches you have seen are good but not reluctant on space --> We will use tortoise and hare complexity as it will help us get find if any duplicate is found,
        // two variables slow and fast
        int slow = nums[0], fast = nums[0];
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast)
                break;
        }
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}