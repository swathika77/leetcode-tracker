// Last updated: 15/07/2026, 15:10:38
1class Solution {
2     public boolean isPowerOfTwo(int n) {
3        return powerFunc(n);
4        // return whichever method you want to call
5    } 
6// Approach 1(Power function) - O(1)  (Beats 96.57%)
7   boolean powerFunc(int n){
8    // generate all poer of 2 and match
9    for(int i=0; i<31; i++){
10        int num=(int)Math.pow(2,i);//O(1)
11        if(num==n)return true;
12    }
13    return false;
14   }
15// Approach 2(Dividing by 2) - O(logn) (Beats 96.57%)
16   boolean divideBy2(int n){
17    if(n==0) return false;
18    if(n<0) return false;
19    while(n!=1){
20        if(n%2==1)return false;// odd intermediate came then reject it, break simply
21        n=n/2;
22    }
23    return true;
24   }
25
26// Approach 3(left shift) - O(logn)
27
28// Approach 4(Ceil and Floor) - O(1)
29//   ceil means gif(step wise function), floor is like nearest integer
30//   ceil and floor same means 2's power?
31    boolean ceilfloorWay(int n){
32        if(n==0) return false;
33        return Math.floor(Math.log(n)/Math.log(2)) ==  Math.ceil(Math.log(n)/Math.log(2));
34    }
35
36
37// Approach 5(And operator) - O(1)
38// And operation between power of 2 and next lower number will always give 0 and other wise it will never be 0.
39    boolean AndWay(int n){
40        if(n>0 && (n&(n-1))==0) return true;
41        else return false;
42
43    }
44// Approach 6(Counting 1's) - O(logn)
45    // If count bits is 1 and Left Most Bit is only there, which means number is power of 2
46
47// Approach 7(Modulo with n) - O(1)
48//    2^30 = 2^a * 2^b, means n must divide 2^30, if 2^30 modulo n is zero, return true!
49    boolean moduloToTwoRaiseTo30(int n){
50        if(n<=0)return false;
51        if((1<<30) % n == 0)return true;
52        else return false;
53    }
54     
55
56// Approach 8(Recursion) - O(logn)
57    boolean func(int n){
58        if(n<=0) return false;
59        if(n==1) return true;
60        return (n%2==0) && func(n/2);
61    }
62}