class Solution {
    public int[] plusOne(int[] digits) {
        int fin = 0;
        if(digits == null || digits.length == 0) return digits;
        int [] res = new int[digits.length+1];
        boolean checkLessThan9 = false;
        int n = digits.length;
        if(digits[n-1]<9) checkLessThan9 = true;
        if(checkLessThan9) {
            digits[n-1] = 1 + digits[n-1];
            return digits;
        }

        // Only Carry Logic working
        int carry = 1;
            for(int i=n-1;i>=0;i--) {
                int sum = digits[i] + carry;
                digits[i] = sum % 10;
                carry = sum / 10;
            }
            if(carry == 1) {
                res[0] = 1;
                for(int i=0;i<n;i++) {
                    res[i+1] = digits[i];
                }
                return res;
            }
        return digits;
    }
}