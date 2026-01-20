class Solution {
    public String addStrings(String num1, String num2) {
        
        // Stupid solution but atleast one we got down
        // Solution 1
        // 10^4 is length of string not number
//        Long n1 = Long.parseLong(num1);
//        Long n2 = Long.parseLong(num2);
//        Long ans = n1 + n2;
//        return ans.toString();



        // Solution 2 -> We will use the funda of carry forward --> (digit + digit + carry) --> carry --> 10 x carry + last
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        String res = "";
        // 109999938783890032900209  = 10 // 99200389992000299398 = 10
        while(i>=0 || j>=0 || carry > 0) {
            // Number nikalna hai String ke andar se
            int a = 0;
            if (i >= 0) {
                a = num1.charAt(i) - '0'; // ASCII a - z A - Z 0 - 9 --> "9" - "0"  = 9
                i--;
            }
            int b = 0;
            if (j >= 0) {
                b = num2.charAt(j) - '0'; // ASCII a - z A - Z 0 - 9 --> "9" - "0"  = 9
                j--;
            }
            int sum = a + b + carry;// digit + digit + carry
            int digit = sum % 10;
            carry = sum / 10;
            res = digit + res;
        }
        return res;
    }
}