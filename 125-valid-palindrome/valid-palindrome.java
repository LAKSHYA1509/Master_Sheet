class Solution {
    public boolean isPalindrome(String s) {
        // Char frequency method
        // Two Pointer method (Choosing this)
        //Strings are immutable --> There is a new copy everytime created
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}