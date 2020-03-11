import java.util.ArrayList;
import java.util.List;

public class Solution {
	public int[] solution(int []arr) {
		List<Integer> ans = new ArrayList<>();
		ans.add(arr[0]);
		for (int i = 1; i < arr.length; ++i) {
			if (ans.get(ans.size() - 1) != arr[i]) {
				ans.add(arr[i]);
			}
		}
		return ans.stream().mapToInt(Integer::intValue).toArray();
	}
}