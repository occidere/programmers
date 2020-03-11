class Solution {
	boolean solution(String s) {
		return 0 == s.chars()
				.map(c -> c == 'P' || c == 'p' ? 1 : c == 'Y' || c == 'y' ? -1 : 0)
				.sum();
	}
}