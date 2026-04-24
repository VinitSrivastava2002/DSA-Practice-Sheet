package DP;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=5;
        int[] dp =new int[n+1];
        Arrays.fill(dp, -1);
//        System.out.println(fibo(n, dp));
        System.out.println(fibo1(5));
    }
    // by memoization method (top-down)
    static int fibo(int n, int[] dp){
        if(n<=1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = fibo(n-1, dp) +fibo(n-2, dp);
    }

    static int fibo1(int n){
        int prev=1;
        int prev2=0;
        for(int i=2;i<=n;i++){
            int curr = prev+prev2;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}
