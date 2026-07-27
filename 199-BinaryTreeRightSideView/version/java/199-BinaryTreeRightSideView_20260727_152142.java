// Last updated: 27/07/2026, 15:21:42
1class Solution 
2{
3    public static  int Sieve(int R)
4    {
5        boolean[] P=new boolean[R+1];
6        Arrays.fill(P,true);
7        P[0]=P[1]=false;
8        for(int i=2;i<=R;i++)
9        {
10            if(P[i])
11            {
12                for(long j=(long)i*i;j<=R;j+=i)
13                {
14                    P[(int)j]=false;
15                }
16            }
17        }
18        int arr=0;
19        for(boolean e : P)
20        {
21            if(e)
22            {
23                arr++;
24            }
25        }
26        return arr;
27    }
28    public int countPrimes(int n) 
29    {
30        if(n==0 || n==1 || n-1==1)
31        {
32            return 0;
33        }
34        return Sieve(n-1);
35    }
36}