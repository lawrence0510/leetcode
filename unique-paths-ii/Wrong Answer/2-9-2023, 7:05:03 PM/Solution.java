// https://leetcode.com/problems/unique-paths-ii

// import java.util.List;
// import java.util.Scanner;
// import java.util.ArrayList;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1] == 1){
            return 0;
        }
        boolean hasObstacles = false;
        for(int i = 0 ; i < obstacleGrid.length; i ++){
            for(int j = 0 ; j < obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] == 1){
                    hasObstacles = true;
                }
            }
        }
        if(hasObstacles){
        for(int i = 0; i < obstacleGrid.length; i++){ //邊邊有障礙物 = 0, 沒有的話default 1
            if(obstacleGrid[i][0] == 1){
                obstacleGrid[i][0] = 0;
            }
            else{
                obstacleGrid[i][0] = 1;
            }
        }
        for(int i = 0; i < obstacleGrid[0].length; i++){ //邊邊有障礙物 = 0, 沒有的話default 1
            if(obstacleGrid[0][i] == 1){
                obstacleGrid[0][i] = 0;
            }
            else{
                obstacleGrid[0][i] = 1;
            }
        }
        for(int i = 1 ; i < obstacleGrid.length; i ++){
            for(int j = 1 ; j < obstacleGrid[0].length; j++){
                if(obstacleGrid[i][j] != 1){//如果不是障礙物就執行相加
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
                else{
                    obstacleGrid[i][j] = 0 ;
                }
            }
        }
        return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1];}
        else{
            return 1;
        }
    }
}