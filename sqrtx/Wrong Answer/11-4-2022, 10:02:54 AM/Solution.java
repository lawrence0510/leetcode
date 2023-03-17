// https://leetcode.com/problems/sqrtx

class Solution {
        public int mySqrt(int x) {
        long y = x;
		int i = 1;
		while(i * i <= y) {
			i++;
		}
		return i-1;
    }
}