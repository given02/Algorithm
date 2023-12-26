import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
		int currentTime = 0; 
		int currentIdx = 0; 
		int count = 0; 
        
        Arrays.sort(jobs, (o1, o2) -> o1[0] - o2[0]);

		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);
        
        while (count < jobs.length) {
            while (currentIdx < jobs.length && jobs[currentIdx][0] <= currentTime) {
				pq.add(jobs[currentIdx++]);
			}

			if (pq.isEmpty()) {
				currentTime = jobs[currentIdx][0];
			} else {
				int[] temp = pq.poll();
				answer += temp[1] + currentTime - temp[0];
				currentTime += temp[1];
				count++;
			}
		}

		return (int) Math.floor(answer / jobs.length);
    }
}