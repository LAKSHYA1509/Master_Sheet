class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m) return false;

        // Sorting
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        for(int i = 0; i < m; i++) {
            if(s1[i]!=t1[i]) return false;
        }
        // HashMap

        // Character frequency check
        return true;
    }
}