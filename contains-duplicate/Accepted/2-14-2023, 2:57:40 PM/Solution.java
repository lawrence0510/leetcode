// https://leetcode.com/problems/contains-duplicate

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer>a = new HashMap<>();
        for(int i : nums){
            if(a.containsKey(i)){
                a.put(i, a.get(i) + 1);
            }
            else{
                a.put(i, 1);
            }
        }
        for(Map.Entry<Integer, Integer>set: a.entrySet()){
            if(set.getValue() >= 2){
                return true;
            }
        }
        return false;
    }
}