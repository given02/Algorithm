import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String[] temp = new String[numbers.length];
        for(int i=0; i<numbers.length; i++){
            temp[i] = Integer.toString(numbers[i]);
        }
        Arrays.sort(temp, (x,y) -> ((y+x).compareTo(x+y)));
        
        if(temp[0].equals("0")){
            return "0";
        }
        
        String answer = "";
        for(String s : temp){
            answer += s;
        }
        return answer;
    }
}