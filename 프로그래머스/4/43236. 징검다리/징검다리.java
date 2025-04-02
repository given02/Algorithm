import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        
        int answer = 0;
        int left = 1;
        int right = distance;
        while(left <= right){
            int mid = (left + right) / 2;
            int cnt = 0;
            if(getRemovedRockCnt(rocks, mid, distance) <=n){
                answer = mid;
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        
        return answer;
    }
    
    public int getRemovedRockCnt(int[] rocks, int mid, int distance){
        int before = 0;
        int end = distance;
        int cnt = 0;
        
        for(int i = 0; i < rocks.length; i++){
            if(mid > rocks[i] - before){
                cnt++;
                continue;
            }
            before = rocks[i];
        }

        if(end - before < mid) cnt++;
        
        return cnt;

    }
}