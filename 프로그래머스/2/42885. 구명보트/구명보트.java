import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        // 보트는 2명만 탑승 가능, 무게 limit 있음
        // 2명만 탑승 가능하니 그냥 무게가 제일 많이 나가는 사람과 제일 적게 나가는 사람을 같이 보내면 됨
        int answer = 0;
        int idx = 0;
        
        Arrays.sort(people);
        
        for(int i = people.length - 1; i >= idx; i--){ // 절반만 찾으면 되니까 i >= idx 까지
            if(people[i] + people[idx] <= limit){
                idx++;
                answer++;
            } else {
                answer++;
            }
        }
        
        return answer;
    }
}