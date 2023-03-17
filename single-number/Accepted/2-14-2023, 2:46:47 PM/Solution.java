// https://leetcode.com/problems/single-number

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer>a = new HashMap<>();
        for(int i: nums){
            if(a.containsKey(i)){
                a.put(i, a.get(i) + 1);
            }
            else{
                a.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer>set: a.entrySet()){
            if(set.getValue() == 1){
                return set.getKey();
            }
        }
        return -1;
    }
}