// https://leetcode.com/problems/length-of-last-word

class Solution {
    public int lengthOfLastWord(String s) {
       for(int i = s.length()-1; i >=0; i--) {
			if(Character.toString(s.charAt(i)).equals(" ")) {
				return s.substring(i + 1).length();
			}
		}
		return 0;
    }
}