// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			switch (Character.toString(s.charAt(i))) {
			case ("("):
				list.add("(");
			break;
			case ("["):
				list.add("[");
			break;
			case ("{"):
				list.add("{");
			break;
			}
		}
		System.out.println(list);
		for(int j = s.length() - 1; j >= 0; j--) {
			switch (Character.toString(s.charAt(j))) {
			case (")"):
				if(list.get(0) == "(") {
					list.remove(0);
					break;
				}
				else {
					return false;
				}
			case ("]"):
				if(list.get(0) == "[") {
					list.remove(0);
					break;
				}
				else {
					return false;
				}
			case ("}"):
				if(list.get(0) == "{") {
					list.remove(0);
					break;
				}
				else {
					return false;
				}
			}
		}
		return true;
    }
}