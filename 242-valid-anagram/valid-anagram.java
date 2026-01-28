class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (n != m) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < m; i++) {
            if(map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                if(map.get(t.charAt(i)) == 0) map.remove(t.charAt(i));
            }
        }
        // Character frequency check
//        char[] s1 = s.toCharArray();
//        char[] t1 = t.toCharArray();
        return map.isEmpty();
    }
}