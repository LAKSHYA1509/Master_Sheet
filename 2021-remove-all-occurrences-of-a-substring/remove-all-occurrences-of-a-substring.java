class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        int n = part.length();
        for(int i= 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            if(stack.size() >= n) {
                boolean check = true;
                for(int j = 0; j < n; j++) {
                    if(stack.get(stack.size() - n + j) != part.charAt(j)) {
                        check = false;
                        break;
                    }
                }
                if(check) {
                    for(int j = 0; j < n; j++) {
                    stack.pop();
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}