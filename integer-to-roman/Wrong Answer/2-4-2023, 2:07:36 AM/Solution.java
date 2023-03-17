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
                    if(temp == 1){
                        a = "X" + a;
                    }
                    else{
                        a = "I".repeat(temp) + "X";
                    }
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
                    if(temp == 1){
                        a = "C" + a;
                    }
                    else{
                        a = "I".repeat(temp) + "C";
                    }
                }
                break;

                case 4:
                if(temp == 1){
                    a = "M" + a;
                }
                else{
                    a = "I".repeat(temp) + "M";
                }
                break;
            }
        }
        return a;
    }
}