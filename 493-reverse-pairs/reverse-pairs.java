class Solution {
    public int reversePairs(int[] nums) {
        return mergeSort(nums);
    }

    static private int mergeSort(int[] nums) {
        int n = nums.length;
        if (n <= 1)
            return 0;
        int mid = n / 2;
        int left[] = Arrays.copyOfRange(nums, 0, mid);
        int right[] = Arrays.copyOfRange(nums, mid, n);
        int count = mergeSort(left) + mergeSort(right);

        int j = 0;
        for (int i = 0; i < left.length; i++) {
            while (j < right.length && (long) left[i] > 2L * right[j]) {
                j++;
            }
            count += j;
        }
        merge(nums, left, right);

        return count;
    }

    static private void merge(int[] nums, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                nums[k++] = left[i++];
            } else {
                nums[k++] = right[j++];
            }
        }
        while (i < left.length)
            nums[k++] = left[i++];
        while (j < right.length)
            nums[k++] = right[j++];
    }
}
