// https://leetcode.com/problems/pascals-triangle-ii

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>test = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            test.add(i);
        }
        int a = 1;
        for(int k = 0; k <= rowIndex/2; k++){
                test.set(k, a);
                test.set(rowIndex-k, a);
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