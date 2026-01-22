class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int [] res = new int[n];
        ArrayList<Integer> pos = new ArrayList<>(n/2);
        ArrayList<Integer> neg = new ArrayList<>(n/2);
        for (int num : nums) {
            if(num>0) pos.add(num);
            else neg.add(num);
        }
        for(int i = 0; i < n; i++) {
            // First element of pos then neg then pos then neg in alternate ways
                if (i % 2 == 0) {
                    res[i] = pos.get(i / 2);
                } else {
                    res[i] = neg.get(i / 2);
                }
            }
        return res;
    }
}