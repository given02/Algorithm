import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++){
            list.add(score[i]);
            if(i >= k){
                list.remove(Collections.min(list));
            }
            answer[i] = Collections.min(list);
        }
        
        return answer;
    }
}