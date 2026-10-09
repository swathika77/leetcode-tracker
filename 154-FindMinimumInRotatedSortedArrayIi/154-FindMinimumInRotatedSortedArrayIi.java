// Last updated: 09/10/2026, 09:26:21
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] < nums[r]) {
                r = mid;
            }
            else if (nums[mid] > nums[r]) {
                l = mid + 1;
            }
            // duplicates
            else {
                r--;
            }
        }

        return nums[l];
    }
}