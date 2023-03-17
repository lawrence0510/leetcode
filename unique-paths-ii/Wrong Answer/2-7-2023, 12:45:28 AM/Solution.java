// https://leetcode.com/problems/unique-paths-ii

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        for(int i = 0; i < obstacleGrid.length; i++){
                    if(obstacleGrid[i][0] == 1){
                        obstacleGrid[i][0] = 0;
                    }
                    else{
                        obstacleGrid[i][0] = 1;
                    }
                }
                for(int i = 1 ; i < obstacleGrid.length; i ++){
                    for(int j = 1 ; j < obstacleGrid[0].length; j++){
                        if(obstacleGrid[i][j] != 1){
                            obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                        }
                    }
                }
                if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]-1 == 0){
                    return 1;
                }
                else if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]-1 == -1){
                    return 0;
                }
                else{
                    return obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]-1;
                }
            }
    }