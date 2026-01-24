class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for(int key : map.keySet()) {
            if(map.get(key) == 1) return key;
        }

        return -1;
    }
}