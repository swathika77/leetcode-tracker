// Last updated: 28/07/2026, 15:47:52
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        for(int i = 0; i < matrix.length; i++){
4            for(int j = 0; j < matrix[0].length; j++){
5                if(matrix[i][j] == target) return true;
6            }
7        }
8        return false;
9    }
10}