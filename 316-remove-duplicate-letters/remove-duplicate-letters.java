class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        Set<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; ++i) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) - 1);
            if (set.contains(c))
                continue;
            while (!stack.isEmpty() && stack.peek() > c && map.get(stack.peek()) > 0) {
                set.remove(stack.pop());
            }
            stack.push(c);
            set.add(c);
        }
        StringBuilder sb = new StringBuilder().reverse();
        for (Character c : stack)
            sb.append(c);
        return sb.toString();
    }
}