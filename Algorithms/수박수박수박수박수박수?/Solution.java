class Solution {
	public String solution(int n) {
		String[] s = {"수", "박"}, ans = new String[n];
		for (int i = 0; i < n; ans[i] = s[i++ % 2]);
		return String.join("", ans);
	}
}