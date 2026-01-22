class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums) {
            pq.add(num);
        }
        int size = pq.size();
        while(size > k) {
            pq.poll();
            size--;
        }
        return pq.peek();
    }
}