// Last updated: 09/07/2026, 10:09:03
class Solution {
    public void sortColors(int[] arr) {
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;

        while (mid <= right) {
            if (arr[mid] == 0) {
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;

                left++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;

                right--;
            }
        }
    }
}