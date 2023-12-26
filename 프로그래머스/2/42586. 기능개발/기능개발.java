import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        int[] days = new int[progresses.length];
        for(int i = 0; i < progresses.length; i++){
            int day = 0;
            while(true){
                if(progresses[i] >= 100){
                    break;
                }
                progresses[i] += speeds[i];
                day++;
            }
            days[i] = day;
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        int value = days[0];
        int count = 0;
        for(int i = 0; i < days.length; i++){
            if(value >= days[i]){
                count++;
            } else{
                list.add(count);
                value = days[i];
                count = 1;
            }
            if(i + 1 == days.length){
                list.add(count);
            }
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}