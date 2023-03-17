// https://leetcode.com/problems/reverse-integer

class Solution {
    public int reverse(int x) {
        int answer = 0;
        int digits = 0;
        int[]array = new int[20];
        for(int i = 0; i < 20; i++){
            if(x != 0){
                array[i] = x % 10;
                x = x / 10;
                digits++;
            }
            else{
                array[i] = 0;
            }
        }
        for(int i = 0; i < 20; i++){
            if(digits >= 1){
                answer += array[i] * Math.pow(10, digits-1);
                digits--; 
            }
        }
        return answer;
    }
}