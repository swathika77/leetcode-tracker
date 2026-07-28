// Last updated: 28/07/2026, 14:38:52
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] output = new int[nums.length];
4        for (int i = 0; i < nums.length; i++) {
5            output[i] = 1;
6        }
7
8        int left = 1;
9        for (int i = 0; i < nums.length; i++) {
10            output[i] *= left;
11            left *= nums[i];
12        }
13
14        int right = 1;
15        for (int i = nums.length - 1; i >= 0; i--) {
16            output[i] *= right;
17            right *= nums[i];
18        }
19
20        return output;        
21    }
22}