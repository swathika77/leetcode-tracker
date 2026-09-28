// Last updated: 28/09/2026, 09:09:05
1import java.util.*;
2
3class Solution {
4    public int[] rearrangeArray(int[] nums) {
5        List<Integer> ans = new ArrayList<>();
6        Map<Integer, Integer> freq = new HashMap<>();
7        for (int num : nums) {
8            freq.put(num, freq.getOrDefault(num, 0) + 1);
9        }
10        
11        while (!freq.isEmpty()) {
12            List<Integer> distinct = new ArrayList<>(freq.keySet());
13            Collections.sort(distinct);
14            for (int val : distinct) {
15                ans.add(val);
16                freq.put(val, freq.get(val) - 1);
17                if (freq.get(val) == 0) {
18                    freq.remove(val);
19                }
20            }
21        }
22        int[] result = new int[ans.size()];
23        for (int i = 0; i < ans.size(); i++) {
24            result[i] = ans.get(i);
25        }
26        return result;
27    }
28}
29