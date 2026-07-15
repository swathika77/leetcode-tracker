// Last updated: 15/07/2026, 15:11:52
class Solution {
     public boolean isPowerOfTwo(int n) {
        return powerFunc(n);
        // return whichever method you want to call
    } 
// Approach 1(Power function) - O(1)  (Beats 96.57%)
   boolean powerFunc(int n){
    // generate all poer of 2 and match
    for(int i=0; i<31; i++){
        int num=(int)Math.pow(2,i);//O(1)
        if(num==n)return true;
    }
    return false;
   }
// Approach 2(Dividing by 2) - O(logn) (Beats 96.57%)
   boolean divideBy2(int n){
    if(n==0) return false;
    if(n<0) return false;
    while(n!=1){
        if(n%2==1)return false;// odd intermediate came then reject it, break simply
        n=n/2;
    }
    return true;
   }

// Approach 3(left shift) - O(logn)

// Approach 4(Ceil and Floor) - O(1)
//   ceil means gif(step wise function), floor is like nearest integer
//   ceil and floor same means 2's power?
    boolean ceilfloorWay(int n){
        if(n==0) return false;
        return Math.floor(Math.log(n)/Math.log(2)) ==  Math.ceil(Math.log(n)/Math.log(2));
    }


// Approach 5(And operator) - O(1)
// And operation between power of 2 and next lower number will always give 0 and other wise it will never be 0.
    boolean AndWay(int n){
        if(n>0 && (n&(n-1))==0) return true;
        else return false;

    }
// Approach 6(Counting 1's) - O(logn)
    // If count bits is 1 and Left Most Bit is only there, which means number is power of 2

// Approach 7(Modulo with n) - O(1)
//    2^30 = 2^a * 2^b, means n must divide 2^30, if 2^30 modulo n is zero, return true!
    boolean moduloToTwoRaiseTo30(int n){
        if(n<=0)return false;
        if((1<<30) % n == 0)return true;
        else return false;
    }
     

// Approach 8(Recursion) - O(logn)
    boolean func(int n){
        if(n<=0) return false;
        if(n==1) return true;
        return (n%2==0) && func(n/2);
    }
}