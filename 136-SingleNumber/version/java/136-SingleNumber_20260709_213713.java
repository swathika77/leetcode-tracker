// Last updated: 09/07/2026, 21:37:13
1class Solution {
2    public int singleNumber(int[] nums) {
3        int result=0;
4        for(int i=0; i<nums.length; i++) {
5            result = result^nums[i];
6        }
7        return result;
8    }
9}