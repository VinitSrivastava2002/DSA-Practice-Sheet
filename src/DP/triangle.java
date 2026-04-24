package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(Arrays.asList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));

        System.out.println(minimumTotal(triangle));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        // fill with -1 for memoization
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return fun(0, 0, triangle, n, dp);
    }

    private static int fun(int i, int j, List<List<Integer>> triangle, int n, int[][] dp) {
        // base case: last row
        if (i == n - 1) {
            return triangle.get(i).get(j);
        }

        // if already calculated, return
        if (dp[i][j] != -1) return dp[i][j];

        int down = triangle.get(i).get(j) + fun(i + 1, j, triangle, n, dp);
        int diag = triangle.get(i).get(j) + fun(i + 1, j + 1, triangle, n, dp);

        return dp[i][j] = Math.min(down, diag);
    }
}
