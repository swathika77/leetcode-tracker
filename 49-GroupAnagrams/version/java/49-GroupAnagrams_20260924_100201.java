// Last updated: 24/09/2026, 10:02:01
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> ans = new HashMap<>();
4
5        for (String s : strs) {
6            int[] count = new int[26];
7
8            // Count frequency of each letter in the string
9            for (char c : s.toCharArray()) {
10                count[c - 'a']++;
11            }
12
13            StringBuilder sb = new StringBuilder();
14            for (int num : count) {
15                sb.append(num).append("#");
16            }
17            String key = sb.toString();
18            if (!ans.containsKey(key)) {
19                ans.put(key, new ArrayList<>());
20            }
21            ans.get(key).add(s);
22        }
23
24        return new ArrayList<>(ans.values());        
25    }
26}