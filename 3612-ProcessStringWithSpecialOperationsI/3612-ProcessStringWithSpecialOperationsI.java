// Last updated: 09/10/2026, 09:23:19
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