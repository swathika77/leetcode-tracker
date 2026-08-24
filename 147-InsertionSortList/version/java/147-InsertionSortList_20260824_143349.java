// Last updated: 24/08/2026, 14:33:49
1class Solution {
2  public int maxProduct(int[] nums) {
3    int ans = nums[0];
4    int dpMin = nums[0];
5    int dpMax = nums[0];
6
7    for (int i = 1; i < nums.length; ++i) {
8      final int num = nums[i];
9      final int prevMin = dpMin;
10      final int prevMax = dpMax;
11      if (num < 0) {
12        dpMin = Math.min(prevMax * num, num);
13        dpMax = Math.max(prevMin * num, num);
14      } else {
15        dpMin = Math.min(prevMin * num, num);
16        dpMax = Math.max(prevMax * num, num);
17      }
18      ans = Math.max(ans, dpMax);
19    }
20    return ans;
21  }
22}