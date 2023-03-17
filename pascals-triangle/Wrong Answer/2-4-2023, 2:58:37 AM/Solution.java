// https://leetcode.com/problems/pascals-triangle

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>test = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            int a = 1;
            ArrayList<Integer>temp = new ArrayList<Integer>();
            for(int k = 0; k <= i; k++){
                temp.add(a);
                a *= (i-k)/(k+1);
            }
            test.add(temp);
        }
        return test;
    }
}