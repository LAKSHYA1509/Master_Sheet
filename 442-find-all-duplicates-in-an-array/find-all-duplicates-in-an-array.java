class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        // Its good to define a space beforehand so to not put pressure back on heap
        List<Integer> res = new ArrayList<>(n);

        // Approach 1 --> HashMap
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<n; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//            if(map.get(nums[i]) > 1) res.add(nums[i]);
//        }

        // Approach 2 --> HashSet

//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            if (set.contains(nums[i])) res.add(nums[i]);
//            set.add(nums[i]);
//        }
        // Approach 3 --> Bool array of seen'

//        boolean[] seen = new boolean[n + 1];
//        for (int num : nums) {
//            if (seen[num]) res.add(num);
//            else seen[num] = true;
//        }

        // Approach 4 --> Nested Loop (Worst of all)


//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] == nums[j]) res.add(nums[i]);
//            }
//        }

        // Approach 5 --> Cyclic Sort(Negate what is present in that position and you will find ahead)
        // Imagine you have a switch which you can only turn once and not again and again, Cyclic sort helps in this case by marking index already present to negate in the sign
        for(int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            int idx = val - 1;

            if(nums[idx] < 0) res.add(val);
            nums[idx] = -nums[idx];
        }
        return res;
    }
}