// https://leetcode.com/problems/climbing-stairs

class Solution {
    public int climbStairs(int n) {
        int theLastTwo = 0;
		int theLastNum = 1;
		int temp;
		k = k+1;
		 if (k == 0) 
	            return theLastTwo; 
	        
	        for (int index = 2; index <= k; index++) { 
	            temp = theLastTwo + theLastNum; 
	            theLastTwo = theLastNum; 
	            theLastNum = temp; 
	        } 
	        return theLastNum; 
    }
}