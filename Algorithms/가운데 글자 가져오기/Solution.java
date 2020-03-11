class Solution {
	public String solution(String s) {
		return s.substring(s.length() / 2 - (s.length() % 2 == 0 ? 1 : 0), s.length() / 2 + 1);
	}
}