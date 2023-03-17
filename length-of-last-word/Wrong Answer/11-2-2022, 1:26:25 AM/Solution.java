// https://leetcode.com/problems/length-of-last-word

class Solution {
    public int lengthOfLastWord(String s) {
        return s.substring(s.indexOf(" ") + 1).length();
    }
}