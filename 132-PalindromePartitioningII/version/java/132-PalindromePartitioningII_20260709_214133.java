// Last updated: 09/07/2026, 21:41:33
1class Solution {
2    public int minCut(String s) {
3        int n = s.length();
4        int[] dp = new int[n];
5        Arrays.fill(dp, -1);
6        return solve(0, s, dp) - 1; // cuts = partitions - 1;
7    }
8    private int solve(int i, String s, int[] dp){
9        int n = s.length();
10        if(i == n) return 0;
11
12        if(dp[i] != -1) return dp[i];
13
14        int minCost = Integer.MAX_VALUE;
15
16        for(int j = i; j < n; j++){
17            if(isPalindrome(s, i, j)){
18                int cost = 1 + solve(j + 1, s, dp);
19                minCost = Math.min(minCost, cost);
20            }
21        }
22        return dp[i] = minCost;
23    }
24    private boolean isPalindrome(String s, int i, int j){
25        while(i < j){
26            if(s.charAt(i) != s.charAt(j)) return false;
27            i++;
28            j--;
29        }
30        return true;
31    }
32}