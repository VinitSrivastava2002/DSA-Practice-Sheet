package DP;

import java.util.Arrays;

public class Unique_Path {
    public static void main(String[] args) {
        int m=3;
        int n=2;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(dp, m,n,0,0);
    }
    public static int solve(int[][]dp, int m, int n, int i, int j){
        if(i==m-1 && j==n-1){
            return 1;
        }

        if(i<0 || i>=m || j<0 || j>=n){
            return 0;
        }

        if(dp[i][j]!= -1){
            return dp[i][j];
        }

        int right = solve(dp,m,n,i,j+1);
        int down = solve(dp,m,n,i+1,j);

        return dp[i][j] = right+down;
    }
}
