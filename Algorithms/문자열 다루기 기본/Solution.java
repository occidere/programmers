class Solution {
	public boolean solution(String s) {
		return 0 == s.chars()
				.filter(c -> c < '0' || c > '9')
				.count()
				&& (s.length() == 4 || s.length() == 6);
	}
}