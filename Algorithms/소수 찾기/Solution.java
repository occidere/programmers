import java.util.Arrays;

class Solution {
	public int solution(int n) {
		int[] isNotPrime = new int[n + 1];
		eratosthenes(isNotPrime);
		return n - Arrays.stream(isNotPrime).sum();
	}

	private void eratosthenes(int[] isNotPrime) {
		for (int i = 2; i * i < isNotPrime.length; i++) {
			if (isNotPrime[i] == 0) {
				for (int j = i * i; j < isNotPrime.length; j += i) {
					isNotPrime[j] = 1;
				}
			}
		}
		isNotPrime[1] = 1;
	}
}