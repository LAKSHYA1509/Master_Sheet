class Solution {
    public double myPow(double x, int n) {
        // cast n to long to handle Integer.MIN_VALUE
        long N = n;
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        if (N == 0) return 1;

        double half = myPow(x, (int)(N / 2)); // safe, N/2 fits in int for recursion
        return (N % 2 == 0) ? half * half : half * half * x;
    }
}
