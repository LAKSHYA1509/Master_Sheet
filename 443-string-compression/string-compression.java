class Solution {
    public int compress(char[] chars) {
        ArrayList<Character> res = new ArrayList<>();
        int n = chars.length;
        // 2 pointers one fast one slow
        int i = 0;
        for (int j = 0; j <= n; j++) {
            if (j == n || chars[j] != chars[i]) {
                res.add(chars[i]);
                int count = j - i;
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        res.add(c);
                    }
                }
                i = j;
            }
        }
        for (int k = 0; k < res.size(); k++) {
        chars[k] = res.get(k);
    }
        return res.size();
    }
}