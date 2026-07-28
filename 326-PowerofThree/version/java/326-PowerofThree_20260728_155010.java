// Last updated: 28/07/2026, 15:50:10
1public class Solution {
2    public boolean isPowerOfThree(int n) {
3        int maxPowerOf3 = 1162261467; // 3^19 is the largest power of 3 in int range
4        return n > 0 && maxPowerOf3 % n == 0;
5    }
6}