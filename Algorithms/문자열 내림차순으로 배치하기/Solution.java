class Solution {
	public String solution(String s) {
		return s.chars()
				.sorted()
				.mapToObj(c -> "" + (char) c)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.reverse()
				.toString();
	}
}