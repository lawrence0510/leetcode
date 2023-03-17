// https://leetcode.com/problems/length-of-last-word

class Solution {
    public int lengthOfLastWord(String s) {
       for(int i = s.length() - 1 ; i >= 0; i --) {
			if(!(Character.toString(s.charAt(i)).equals(" "))) {
				s = s.substring(0, i+1);
				break;
			}
		}
		if(s.length() == 1) {
			return 1;
		}
		for(int i = s.length() - 1; i >= 0; i--) {
			if(Character.toString(s.charAt(i)).equals(" ")) {
				return (s.length() - i - 1);
			}
		}
		return 0;
    }
}