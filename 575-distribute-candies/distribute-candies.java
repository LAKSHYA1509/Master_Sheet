class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int div = n/2;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++) {
            set.add(candyType[i]);
        }
        return (set.size()-div==0) ? div : Math.min(div,set.size());
    }
}