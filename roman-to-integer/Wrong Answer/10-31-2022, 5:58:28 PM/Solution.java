// https://leetcode.com/problems/roman-to-integer

class Solution {
    public int romanToInt(String s) {
        int sum = 0;
		int number = 0;
		int previous = 0;
		for(int i = s.length() -1; i>=0; i--) {
			switch(s.charAt(i)) {
				case 'M':
					number = 1000;
				case 'D':
					number = 500;
				case 'C':
					number = 100;
				case 'L':
					number = 50;
				case 'X':
					number = 10;
				case 'V':
					number = 5;
				case 'I':
					number = 1;		
			}
			if(number < previous) {
				sum -= number;
			}
			else {
				sum += number;
			}
			previous = number;
		}
		return sum;
    }
}