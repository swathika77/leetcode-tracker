// Last updated: 15/07/2026, 15:08:38
1
2
3public class Solution {
4    public List<Integer> majorityElement(int[] nums) {
5        int candidate1 = 0, candidate2 = 0, count1 = 0, count2 = 0;
6        
7        for (int num : nums) {
8            if (candidate1 == num) count1++;
9            else if (candidate2 == num) count2++;
10            else if (count1 == 0) {
11                candidate1 = num;
12                count1 = 1;
13            } else if (count2 == 0) {
14                candidate2 = num;
15                count2 = 1;
16            } else {
17                count1--;
18                count2--;
19            }
20        }
21        
22        count1 = count2 = 0;
23        for (int num : nums) {
24            if (num == candidate1) count1++;
25            else if (num == candidate2) count2++;
26        }
27        
28        List<Integer> ans = new ArrayList<>();
29        if (count1 > nums.length / 3) ans.add(candidate1);
30        if (count2 > nums.length / 3) ans.add(candidate2);
31        
32        return ans;
33    }
34}