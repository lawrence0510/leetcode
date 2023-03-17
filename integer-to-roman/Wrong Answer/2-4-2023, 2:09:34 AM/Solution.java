// https://leetcode.com/problems/integer-to-roman

class Solution {
    public String intToRoman(int num) {
        int times = 0;
        String a = "";
        while(num > 0){
            times++;
            int temp = num % 10;
            num = num / 10;
            switch(times){
                case 1:
                if(temp == 4){
                    a += "IV";
                }
                else if(temp == 9){
                    a += "IX";
                }
                else if(temp >=5){
                    a += "V";
                    a += "I".repeat(temp - 5);
                }
                else{
                    a += "I".repeat(temp);
                }
                break;

                case 2:
                if(temp == 4){
                    a = "XL" + a;
                }
                else if(temp == 9){
                    a = "XC" + a;
                }
                else if(temp >=5){
                    a = "L" + a;
                    a = "I".repeat(temp - 5) + a;
                }
                else{
                    a = "X".repeat(temp) + a;
                }
                break;

                case 3:
                if(temp == 4){
                    a = "CD" + a;
                }
                else if(temp == 9){
                    a = "CM" + a;
                }
                else if(temp >=5){
                    a = "D" + a;
                    a = "I".repeat(temp - 5) + a;
                    a = "C" + a;
                }
                else{
                    a = "C".repeat(temp) + a;
                }
                break;

                case 4:
                a = "M".repeat(temp) + a;
                break;
            }
        }
        return a;
    }
}