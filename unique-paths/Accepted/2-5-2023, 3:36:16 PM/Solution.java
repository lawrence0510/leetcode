// https://leetcode.com/problems/unique-paths

class Solution {
    public int uniquePaths(int m, int n) {
        int[][] temp = new int[m][n];
        for(int i = 0 ; i < temp.length ; i ++){
            temp[i][0] = 1;
        }
        for(int i = 0 ; i < temp[0].length; i ++){
            temp[0][i] = 1;
        }
        for(int i = 1 ; i < temp.length; i ++){
            for(int j = 1; j < temp[0].length; j++){
                temp[i][j] = temp[i-1][j] + temp[i][j-1];
            }
        }
        return temp[m-1][n-1];
    }
}