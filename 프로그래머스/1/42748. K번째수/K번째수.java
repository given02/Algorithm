import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int num=0; num<commands.length; num++){
            int i = commands[num][0]-1;
            int j = commands[num][1]-1;
            int k = commands[num][2]-1;
            
            ArrayList<Integer> newArr = new ArrayList<>();
            for(int l=i; l<=j; l++){
                newArr.add(array[l]);
            }
            Collections.sort(newArr);
            answer[num] = newArr.get(k);
        }
        
        return answer;
    }
}