// https://leetcode.com/problems/happy-number

class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        int temp = n;
        while (temp >= 3) {
            while (temp != 0) {
                a.add(temp % 10);
                temp = temp / 10;
            }
            for(Integer x: a){
                temp += Math.pow(x, 2);
            }
            a.clear();
        }
        return temp == 1;
    }
}