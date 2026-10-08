// Last updated: 08/10/2026, 10:22:11
1class Solution {
2    public void solve(char[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5
6        for(int i=0;i<n;i++)
7        {
8            bfs(board,0,i);
9            bfs(board,m-1,i);
10        }
11        for(int i=0;i<m;i++)
12        {
13            bfs(board,i,0);
14            bfs(board,i,n-1);
15        }
16        for(int i=0;i<m;i++)
17        {
18            for(int j=0;j<n;j++)
19            {
20                if(board[i][j]=='#')
21                    board[i][j]='O';
22                else if(board[i][j]=='O')
23                    board[i][j]='X';
24            }
25        }
26    }
27    void bfs(char board[][],int r,int c)
28    {
29        if(board[r][c]!='O')return;
30
31        int m = board.length;
32        int n = board[0].length;
33
34        int directions[][] = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
35        Queue<int[]> queue = new LinkedList<>();
36
37        queue.add(new int[]{r,c});
38        board[r][c] = '#';
39        while(!queue.isEmpty())
40        {
41            int cell[]=queue.poll();
42            int row = cell[0];
43            int col = cell[1];
44            for(int direction[] : directions)
45            {
46                int newRow = row + direction[0];
47                int newCol = col + direction[1];
48
49                if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && board[newRow][newCol]=='O')
50                {
51                    board[newRow][newCol]='#';
52                    queue.add(new int[]{newRow,newCol});
53                }
54            }
55        }
56    }
57}