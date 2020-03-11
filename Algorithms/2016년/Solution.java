import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
	public String solution(int a, int b) {
		Set[] s = {new HashSet<>(List.of(1, 3, 5, 7, 8, 10, 12)), new HashSet<>(List.of(4, 6, 9, 11))};
		int days = 0, month = 1, date = 1;
		for (; month != a || date != b; ++days, ++date) {
			if ((s[0].contains(month) && date == 31) || (s[1].contains(month) && date == 30) || (month == 2 && date == 29)) {
				++month;
				date = 0;
			}
		}
		return new String[]{"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"}[days % 7];
	}
}