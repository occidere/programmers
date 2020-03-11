import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {
	public int solution(int n, int[] lost, int[] reserve) {
		Set<Integer> ls = Arrays.stream(lost)
				.boxed()
				.collect(Collectors.toSet());
		Set<Integer> rs = Arrays.stream(reserve)
				.sorted()
				.boxed()
				.collect(LinkedHashSet::new, LinkedHashSet::add, LinkedHashSet::addAll);

		for (int k : reserve) {
			if (ls.contains(k)) {
				ls.remove(k);
				rs.remove(k);
			}
		}
		for (int k : rs) {
			ls.remove(ls.contains(k - 1) ? k - 1 : k + 1);
		}

		return n - ls.size();
	}
}