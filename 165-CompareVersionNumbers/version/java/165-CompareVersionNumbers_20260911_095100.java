// Last updated: 11/09/2026, 09:51:00
1class Solution {
2    public String fractionToDecimal(int numerator, int denominator) {
3        if (numerator == 0) return "0";
4        StringBuilder sb = new StringBuilder();
5        if ((numerator < 0) ^ (denominator < 0)) sb.append("-");
6        long num = Math.abs((long) numerator);
7        long den = Math.abs((long) denominator);
8        sb.append(num / den);
9        long rem = num % den;
10        if (rem == 0) return sb.toString();
11        sb.append(".");
12        Map<Long, Integer> seen = new HashMap<>();
13        while (rem != 0) {
14            if (seen.containsKey(rem)) {
15                int pos = seen.get(rem);
16                sb.insert(pos, "(");
17                sb.append(")");
18                break;
19            }
20            seen.put(rem, sb.length());
21            rem *= 10;
22            sb.append(rem / den);
23            rem %= den;
24        }
25        return sb.toString();
26    }
27}