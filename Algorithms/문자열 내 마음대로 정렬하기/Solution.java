import java.util.Arrays;

class Solution {
	public String[] solution(String[] strings, int n) {
		return Arrays.stream(strings)
				.sorted((a, b) -> a.charAt(n) == b.charAt(n) ? a.compareTo(b) : Character.compare(a.charAt(n), b.charAt(n)))
				.toArray(String[]::new);
	}
}