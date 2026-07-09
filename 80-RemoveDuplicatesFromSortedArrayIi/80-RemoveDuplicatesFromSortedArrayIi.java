// Last updated: 09/07/2026, 10:08:53
class Solution {
    public int removeDuplicates(int[] arr) {
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (k < 2 || arr[i] != arr[k - 2]) {
                arr[k] = arr[i];
                k++;
            }
        }

        return k;
    }
}