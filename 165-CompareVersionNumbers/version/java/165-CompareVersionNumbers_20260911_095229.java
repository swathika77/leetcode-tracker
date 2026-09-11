// Last updated: 11/09/2026, 09:52:29
1class Solution {
2    public int countSeniors(String[] details) {
3        int seniorCount = 0;
4        for (String info : details) {
5            char tens = info.charAt(11);
6            char ones = info.charAt(12);
7            if (tens > '6' || (tens == '6' && ones > '0')) {
8                seniorCount++;
9            }
10        }
11        return seniorCount;
12    }
13}