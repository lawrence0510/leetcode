// https://leetcode.com/problems/add-binary

class Solution {
    public String addBinary(String a, String b) {
        int aint = Integer.parseInt(a,2);
		int bint = Integer.parseInt(b,2);
		return Integer.toBinaryString(aint + bint);
    }
}