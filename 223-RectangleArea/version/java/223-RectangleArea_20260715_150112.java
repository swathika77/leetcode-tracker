// Last updated: 15/07/2026, 15:01:12
1class Solution {
2    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
3        int ax = ax2 - ax1;
4        int ay = ay2 - ay1;
5        int a = ax * ay;
6        int bx = bx2 - bx1;
7        int by = by2 - by1;
8        int b = bx * by;
9        int cx ,cx1 , cx2;
10        if(ax1 >= bx2 || ax2 <= bx1 || ay1 >= by2 || ay2 <= by1){
11            return a + b;    
12        }
13        if(ax1 <= bx1 && ax2 >= bx2){
14            cx1 = bx1;
15            cx2 = bx2;
16        }
17        else if(ax1 >= bx1 && ax2 <= bx2){
18            cx1 = ax1;
19            cx2 = ax2;
20        }
21        else if(ax1 <= bx1 && ax2 <= bx2){
22            cx1 = bx1;
23            cx2 = ax2;
24        }
25        else if(ax1 >= bx1 && ax2 >= bx2){
26            cx1 = ax1;
27            cx2 = bx2;
28        }
29        else{
30            cx1 = ax1;
31            cx2 = ax2;
32        }
33        cx = cx2 - cx1;
34        int cy ,cy1 ,cy2;
35        if(ay1 <= by1 && ay2 >= by2){
36            cy1 = by1;
37            cy2 = by2;
38        }
39        else if(ay1 >= by1 && ay2 <= by2){
40            cy1 = ay1;
41            cy2 = ay2;
42        }
43        else if(ay1 <= by1 && ay2 <= by2){
44            cy1 = by1;
45            cy2 = ay2;
46        }
47        else if(ay1 >= by1 && ay2 >= by2){
48            cy1 = ay1;
49            cy2 = by2;
50        }
51        else{
52            cy1 = ay1;
53            cy2 = ay2;
54        }
55        cy = cy2 - cy1;
56        int c = cx * cy;
57        return a + b - c;
58    }
59}