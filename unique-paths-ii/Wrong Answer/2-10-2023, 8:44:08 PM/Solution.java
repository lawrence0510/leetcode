// https://leetcode.com/problems/unique-paths-ii

// import java.util.List;
// import java.util.Scanner;
// import java.util.ArrayList;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1] == 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }
        boolean hasObstacles = false;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if (obstacleGrid[i][j] == 1) {
                    hasObstacles = true;
                }
            }
        }
        if (hasObstacles) {
            int min = Math.min(obstacleGrid.length, obstacleGrid[0].length);
            
            for(int a = 1; a < min; a ++){
                for(int b = 0 ; b <= a; b++){
                    int temp = 1;
                    for(int c = 0 ; c <= a; c++){
                        if(b == a || c == a){
                            temp = temp * obstacleGrid[b][c];
                        }
                    }
                    if(temp == 1){
                        System.out.println("blocked");
                        return 0;
                    }
                }
            }
            for (int i = 0; i < obstacleGrid.length; i++) { // 檢驗如果整列都是1那就直接return 0
                int temp = 1;
                for (int j = 0; j < obstacleGrid[0].length; j++) {
                    temp = temp * obstacleGrid[i][j];
                }
                if (temp == 1) {
                    System.out.println("whole line");
                    return 0;
                }
            }

            for (int i = 0; i < obstacleGrid.length; i++) { // 邊邊有障礙物 = 0, 沒有的話default 1
                if (obstacleGrid[i][0] == 1) {
                    obstacleGrid[i][0] = 0;
                } else {
                    obstacleGrid[i][0] = 1;
                }
            }
            for (int i = 0; i < obstacleGrid[0].length; i++) { // 邊邊有障礙物 = 0, 沒有的話default 1
                if (obstacleGrid[0][i] == 1) {
                    obstacleGrid[0][i] = 0;
                } else {
                    obstacleGrid[0][i] = 1;
                }
            }
            for (int i = 1; i < obstacleGrid.length; i++) {
                for (int j = 1; j < obstacleGrid[0].length; j++) {
                    if (obstacleGrid[i][j] != 1) {// 如果不是障礙物就執行相加
                        obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                    } else {
                        obstacleGrid[i][j] = 0;
                    }
                }
            }
            System.out.println("normal");
            return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
        } else {
            int l = obstacleGrid.length - 1;
            int m = obstacleGrid[0].length - 1;
            // (l+m)!/l!m!
            int temp = 1;
            for (int i = l + m; i > l; i--) {
                temp = temp * i;
            }
            for (int i = 1; i <= m; i++) {
                temp = temp / i;
            }
            System.out.print("no obstacle");
            return temp;
        }
    }
}