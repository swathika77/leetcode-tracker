// Last updated: 28/07/2026, 15:48:44
1public class Solution {
2    public List<Integer> diffWaysToCompute(String input) {
3        List<Integer> res = new ArrayList<Integer>();
4        for (int i = 0; i < input.length(); i++) {
5            char c = input.charAt(i);
6            if (c == '-' || c == '+' || c == '*') {
7                String a = input.substring(0, i);
8                String b = input.substring(i + 1);
9                List<Integer> al = diffWaysToCompute(a);
10                List<Integer> bl = diffWaysToCompute(b);
11                for (int x : al) {
12                    for (int y : bl) {
13                        if (c == '-') {
14                            res.add(x - y);
15                        } else if (c == '+') {
16                            res.add(x + y);
17                        } else if (c == '*') {
18                            res.add(x * y);
19                        }
20                    }
21                }
22            }
23        }
24        if (res.size() == 0) res.add(Integer.valueOf(input));
25        return res;
26    }
27}