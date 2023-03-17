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
            answer += array[i] * Math.pow(10, digits);
            digits--;
        }
        if(answer == 214748364){
            return 0;
        }
        return answer/10;
    }
}