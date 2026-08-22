// Last updated: 22/08/2026, 10:19:19
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public Node left;
6    public Node right;
7    public Node next;
8
9    public Node() {}
10    
11    public Node(int _val) {
12        val = _val;
13    }
14
15    public Node(int _val, Node _left, Node _right, Node _next) {
16        val = _val;
17        left = _left;
18        right = _right;
19        next = _next;
20    }
21};
22*/
23
24class Solution {
25    public Node connect(Node root) {
26        if(root==null)return root;
27        Queue<Node>queue=new LinkedList<>();
28        queue.offer(root);
29        while(!queue.isEmpty()){
30            int len=queue.size();
31            Node prev=null;
32            for(int i=0;i<len;i++){
33                Node cur=queue.poll();
34                if(prev!=null){
35                    prev.next=cur;
36                }
37                prev=cur;
38                if(cur.left!=null)queue.offer(cur.left);
39                if(cur.right!=null)queue.offer(cur.right);
40            }
41            prev.next=null;
42        }
43        return root;
44    }
45}