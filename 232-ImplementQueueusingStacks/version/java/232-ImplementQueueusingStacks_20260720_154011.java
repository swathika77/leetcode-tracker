// Last updated: 20/07/2026, 15:40:11
1class Solution {
2  public int countDigitOne(int n) {
3    int ans = 0;
4    for (long pow10 = 1; pow10 <= n; pow10 *= 10) {
5      final long divisor = pow10 * 10;
6      final int quotient = (int) (n / divisor);
7      final int remainder = (int) (n % divisor);
8      if (quotient > 0)
9        ans += quotient * pow10;
10      if (remainder >= pow10)
11        ans += Math.min(remainder - pow10 + 1, pow10);
12    }
13    return ans;
14  }
15}