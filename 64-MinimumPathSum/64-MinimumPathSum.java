// Last updated: 09/07/2026, 10:09:26
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length-1;
        int n = grid[0].length-1;
        int[][]dp = new int[m+2][n+2];
        // for(int[]row:dp){
        //     Arrays.fill(row,-1);
        // }
        // return helper(grid,m,n,dp);
        dp[0][0] = grid[0][0];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0) continue;
                else if(i==0){
                    dp[i][j] = grid[i][j] + dp[i][j-1];
                }else if(j==0){
                    dp[i][j] = grid[i][j] + dp[i-1][j];
                }else{
                    dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    // public int helper(int[][]grid,int m,int n,int[][]dp){
    //     if(m==0 && n==0) return grid[0][0];
    //     if(m<0 || n<0) return (int) 1e9;
    //     if(dp[m][n]!=-1) return dp[m][n];
    //     int left = helper(grid,m-1,n,dp);
    //     int right = helper(grid,m,n-1,dp);

    //     return dp[m][n] = grid[m][n]+Math.min(left,right);
    // }
}