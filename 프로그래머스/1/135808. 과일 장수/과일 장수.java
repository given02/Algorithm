import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length - 1; i >= score.length % m; i-=m){
            int min = k;
            for(int j = 0; j < m; j++){
                min = Math.min(k, score[i-j]);
            }
            answer += min * m;
        }
        
        
        return answer;
    }
}