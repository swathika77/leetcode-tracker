// Last updated: 09/07/2026, 10:06:58
import java.util.*;

class Solution {
    public int minimumVisitedCells(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        // distance to each cell; -1 = not reached yet
        int[][] dist = new int[m][n];
        for (int[] row : dist) Arrays.fill(row, -1);

        // For each row i, rowSets[i] contains all js in [0..n-1] not yet visited in that row
        TreeSet<Integer>[] rowSets = new TreeSet[m];
        for (int i = 0; i < m; i++) {
            rowSets[i] = new TreeSet<>();
            for (int j = 0; j < n; j++) rowSets[i].add(j);
        }
        // For each col j, colSets[j] contains all is in [0..m-1] not yet visited in that col
        TreeSet<Integer>[] colSets = new TreeSet[n];
        for (int j = 0; j < n; j++) {
            colSets[j] = new TreeSet<>();
            for (int i = 0; i < m; i++) colSets[j].add(i);
        }

        Deque<int[]> q = new ArrayDeque<>();
        dist[0][0] = 1;
        q.addLast(new int[]{0, 0});
        rowSets[0].remove(0);
        colSets[0].remove(0);

        while (!q.isEmpty()) {
            int[] cur = q.removeFirst();
            int x = cur[0], y = cur[1], d = dist[x][y];
            int jump = grid[x][y];

            // 1) Sweep right in row x: all j in (y, y+jump]
            Integer j = rowSets[x].higher(y);
            while (j != null && j <= y + jump) {
                dist[x][j] = d + 1;
                q.addLast(new int[]{x, j});
                rowSets[x].remove(j);
                colSets[j].remove(x);
                j = rowSets[x].higher(j);
            }

            // 2) Sweep down in col y: all i in (x, x+jump]
            Integer i = colSets[y].higher(x);
            while (i != null && i <= x + jump) {
                dist[i][y] = d + 1;
                q.addLast(new int[]{i, y});
                colSets[y].remove(i);
                rowSets[i].remove(y);
                i = colSets[y].higher(i);
            }
        }

        return dist[m - 1][n - 1];
    }
}