class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m) return false;

        char[] s1 = new char[26];
        char[] s2 = new char[26];
        for (int i = 0; i < n; i++) {
            s1[(int)s.charAt(i) - 'a']++;
            s2[(int)t.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(s1[i] != s2[i]) return false;
        }
        return true;
    }
}