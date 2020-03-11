class Solution {
	public long solution(int a, int b) {
		return ((long) (a + b) * (long) (Math.abs(a - b) + 1)) >> 1;
	}
}