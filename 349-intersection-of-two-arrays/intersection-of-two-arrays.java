class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length;
        int m = nums2.length;
        int i = 0, j = 0;
        while(i < n && j < m) {
            if(nums1[i] == nums2[j]) {
                if (res.isEmpty() || res.get(res.size() - 1) != nums1[i]) {
                    res.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return res.stream().mapToInt(k -> k).toArray();
    }
}