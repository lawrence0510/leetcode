// https://leetcode.com/problems/sqrtx

class Solution {
        public int mySqrt(int x) {
        int i = 1;
		while(i * i <= x) {
			i++;
		}
		return i-1;
    }
}