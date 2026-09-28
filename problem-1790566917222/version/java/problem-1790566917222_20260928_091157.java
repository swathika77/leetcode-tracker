// Last updated: 28/09/2026, 09:11:57
1import java.util.*;
2
3class Solution {
4    public int maxEqualAdjacentPairs(int[] nums) {
5        int n = nums.length;
6        
7        // Step 1: Count base pairs
8        int basePairs = 0;
9        for (int i = 0; i < n - 1; i++) {
10            if (nums[i] == nums[i + 1]) basePairs++;
11        }
12        
13        // Step 2: Count boundary contributions
14        Map<Integer, Map<Integer, Integer>> boundary = new HashMap<>();
15        for (int i = 0; i < n - 1; i++) {
16            int a = nums[i], b = nums[i + 1];
17            if (a == b) continue;
18            
19            // boundary a-b
20            boundary.putIfAbsent(a, new HashMap<>());
21            boundary.get(a).put(b, boundary.get(a).getOrDefault(b, 0) + 1);
22            
23            boundary.putIfAbsent(b, new HashMap<>());
24            boundary.get(b).put(a, boundary.get(b).getOrDefault(a, 0) + 1);
25        }
26        
27        // Step 3: Try replacing x -> y only at boundaries
28        int maxPairs = basePairs;
29        for (int x : boundary.keySet()) {
30            for (Map.Entry<Integer, Integer> entry : boundary.get(x).entrySet()) {
31                int y = entry.getKey();
32                int gain = entry.getValue(); // new pairs formed if x → y
33                maxPairs = Math.max(maxPairs, basePairs + gain);
34            }
35        }
36        
37        return maxPairs;
38    }
39}
40