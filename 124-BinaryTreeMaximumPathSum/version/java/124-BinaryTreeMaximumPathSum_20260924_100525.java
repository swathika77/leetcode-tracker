// Last updated: 24/09/2026, 10:05:25
1class Solution {
2    public boolean isPalindrome(String s) {
3        StringBuilder newStr = new StringBuilder();
4        for (char i : s.toCharArray()) {
5            if (Character.isLetterOrDigit(i)) {
6                newStr.append(Character.toLowerCase(i));
7            }
8        }
9        int l = 0, r = newStr.length() - 1;
10        while (l < r) {
11            if (newStr.charAt(l++) != newStr.charAt(r--)) return false;
12        }
13        return true;
14    }
15}