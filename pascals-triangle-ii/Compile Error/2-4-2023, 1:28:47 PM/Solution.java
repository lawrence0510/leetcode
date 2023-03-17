// https://leetcode.com/problems/pascals-triangle-ii

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>test = new ArrayList<>();
        long a = 1;
        for(int k = 0; k <= rowIndex; k++){
                test.add(a);
                a = a*(rowIndex-k)/(k+1);
        }
        return test;
    }
}