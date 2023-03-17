// https://leetcode.com/problems/valid-parentheses

class Solution {
    public boolean isValid(String s) {
        ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			int last = list.size() -1;
			if(last == -1) {
				last = 0;
			}
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
			case(")"):
				if(list.get(last).equals("(")) {
					list.remove(last);
					break;
				}
				else {
					return false;
				}
			case("]"):
				if(list.get(last).equals("[")) {
					list.remove(last);
					break;
				}
				else {
					return false;
				}
			case("}"):
				if(list.get(last).equals("{")) {
					list.remove(last);
					break;
				}
				else {
					return false;
				}
			}

		}
		if(list.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
    }
}