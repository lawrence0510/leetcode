// https://leetcode.com/problems/plus-one

class Solution {
    public int[] plusOne(int[] digits) {
        int n = 0, sum = 0;
		for (int i = digits.length - 1; i >= 0; i--) {
			sum += digits[i] * (int) Math.pow(10, n);
			n++;
		}
		sum++;
		int digit = (int) (Math.log10(sum) + 1);
		String[] newone = new String[digit];
		for(int i = 0 ; i < digit; i ++) {
			newone[i] = Character.toString(Integer.toString(sum).charAt(i));
		}
		int[] newnewone = new int[digit];
		for(int i = 0; i < digit; i++) {
			newnewone[i] = Integer.parseInt(newone[i]);
		}
		return newnewone;
    }
}