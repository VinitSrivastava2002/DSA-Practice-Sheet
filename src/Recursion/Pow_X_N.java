package Recursion;

public class Pow_X_N {
    public static void main(String[] args) {
        double x=2;
        int n=5;
        System.out.println(myPow(x,n));

    }
    // used recursion
    public static double myPow(double x, int n) {
        return solve(x,(long)n);
    }

   // n/2 -> n/4 -> n/8 ----- 1 so the time complexity is log n and it takes auxilary space so the space complexity is log n
    public static double solve(double x, long n){
        //base cond if 2^0 = 1
        if(n==0){
            return 1;
        }
        // if the n is negative pow(2,-3) = 2^-3 = (1/2)^3
        if(n<0){
            return solve(1/x, -n);
        }
        // if the n is even 2^8 = (2*2)^4 = (4*4)^2 = (16*16)^1
        if(n%2==0){
            return solve(x*x, n/2);
        }
        // if the n is odd 2^9 = 2 * 2^8 and for 2^8 use even method
        return x * solve(x*x, (n-1)/2);
    }
}
