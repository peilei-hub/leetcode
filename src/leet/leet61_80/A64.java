package leet.leet61_80;

/**
 * @author: wangpeilei
 * @date: 2021/06/06 17:11
 **/
public class A64 {
    class Solution {
        public int minPathSum(int[][] grid) {
            if (grid == null || grid.length == 0 || grid[0].length == 0) {
                return 0;
            }
            int[][] dp = new int[grid.length][grid[0].length];


            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (i == 0 && j == 0) {
                        dp[0][0] = grid[0][0];
                    } else if (i == 0) {
                        dp[i][j] = dp[i][j - 1] + grid[i][j];
                    } else if (j == 0) {
                        dp[i][j] = dp[i - 1][j] + grid[i][j];
                    } else {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
                    }
                }
            }

            return dp[dp.length - 1][dp[0].length - 1];
        }
    }
}
