// Last updated: 09/10/2026, 09:25:38
public class Solution {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int bit = n & 1;          // Extract the least significant bit
            result = (result << 1) | bit; // Append the bit to the result
            n = n >>> 1;             // Unsigned right-shift
        }
        return result;
    }
}