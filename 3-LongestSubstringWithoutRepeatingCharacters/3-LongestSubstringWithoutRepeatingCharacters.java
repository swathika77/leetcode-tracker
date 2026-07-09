// Last updated: 09/07/2026, 10:11:51
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);

        int left = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            if (last[ch] >= left) {
                left = last[ch] + 1;
            }

            last[ch] = right;
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}