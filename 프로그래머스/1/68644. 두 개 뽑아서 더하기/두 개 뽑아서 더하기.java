import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < numbers.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(i != j){
                    set.add(numbers[i] + numbers[j]);
                }
            }
        }
        
        int[] answer = new int[set.size()];
        int i = 0;
        for(Integer num : set){
            answer[i++] = num;
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}