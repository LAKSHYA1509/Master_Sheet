class Solution {
    public String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        String[] str = s.split(" ");
        int i = 0, j = str.length - 1;
        while (i < j) {
            String temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        String reversed = "";
        for (i = 0; i < str.length; i++) {
            reversed += str[i] + " ";
        }
        return reversed.trim();
    }
}