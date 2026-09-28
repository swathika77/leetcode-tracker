// Last updated: 28/09/2026, 09:04:49
1class Solution {
2    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
3        Set<String>st=new HashSet<>(wordList);
4        if(!st.contains(endWord)) return 0;
5        Queue<String>q=new LinkedList<>();
6        q.offer(beginWord);
7        int count=1;
8        while(!q.isEmpty()){
9            int s=q.size();
10            for(int i=0;i<s;i++){
11                String word=q.poll();
12                if(word.equals(endWord)) return count;
13            
14                char[] arr=word.toCharArray();
15                for(int j=0;j<arr.length;j++){
16                    char or=arr[j];
17                    for(char ch='a';ch<='z';ch++){
18                        arr[j]=ch;
19                        String nw=new String(arr);
20                        if(st.contains(nw)){
21                            q.offer(nw);
22                            st.remove(nw);
23                        }
24                    }
25                    arr[j]=or;
26                }
27            }
28            count++;
29        }
30        return 0;
31    }
32}