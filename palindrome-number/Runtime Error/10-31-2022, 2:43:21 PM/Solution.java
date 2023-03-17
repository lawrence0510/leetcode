// https://leetcode.com/problems/palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
        int digit = Integer.toString(x).length();
		for(int i = 0; i < digit /2 ; i++) {
			if(Integer.toString(x).charAt(i) == Integer.toString(x).charAt(digit-i)){
				continue;
			}
			else {
				return false;
			}
		}
		return true;
    }
}