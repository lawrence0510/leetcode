// https://leetcode.com/problems/pascals-triangle-ii

class Solution {
    public List<Long> getRow(int rowIndex) {
        List<Integer>test = new ArrayList<>();
        int a = 1;
        for(int k = 0; k <= rowIndex; k++){
                test.add(a);
                if(a>100000000){
                    a = a / (k+1) * (rowIndex - k);
                }
                else{
                    a = a*(rowIndex-k)/(k+1);
                }
        }
        return test;
    }
}