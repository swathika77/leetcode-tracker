// Last updated: 09/07/2026, 10:06:45
class Solution {
    public String processStr(String s) {

        StringBuilder res = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (c >= 'a' && c <= 'z') {
                res.append(c);
            }
            else if (c == '*') {

                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1);
                }

            }
            else if (c == '#') {

                String current = res.toString();
                res.append(current);

            }
            else {

                res.reverse();

            }
        }

        return res.toString();
    }
}