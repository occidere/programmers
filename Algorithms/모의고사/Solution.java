import java.util.Arrays;

class Solution {
	public int[] solution(int[] answers) {
		int[] scores = {0, 0, 0};
		int[][] people = {
				{1, 2, 3, 4, 5},
				{2, 1, 2, 3, 2, 4, 2, 5},
				{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
		};

		for (int i = 0; i < answers.length; i++) {
			scores[0] += people[0][i % people[0].length] == answers[i] ? 1 : 0;
			scores[1] += people[1][i % people[1].length] == answers[i] ? 1 : 0;
			scores[2] += people[2][i % people[2].length] == answers[i] ? 1 : 0;
		}

		int maxScore = Integer.max(scores[0], Integer.max(scores[1], scores[2]));
		for (int i = 0; i < scores.length; i++) {
			scores[i] = scores[i] == maxScore ? i + 1 : -1;
		}

		return Arrays.stream(scores).filter(s -> s != -1).toArray();
	}
}