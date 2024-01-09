import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        String[] arr = dartResult.split("");
        int[] scores = new int[3];
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i].matches("\\d*")){
                if(arr[i].equals("0") && i != 0 && arr[i-1].equals("1")){
                    scores[cnt] = 10;
                } else {
                    if(i != 0) cnt++;
                    scores[cnt] = Integer.parseInt(arr[i]);
                }
            } else {
                switch(arr[i]){
                    case "D":
                        scores[cnt] *= scores[cnt];
                        break;
                    case "T":
                        scores[cnt] *= scores[cnt] * scores[cnt];
                        break;
                    case "#":
                        scores[cnt] *= -1;
                        break;
                    case "*":
                        scores[cnt] *= 2;
                        if(cnt > 0) scores[cnt-1] *= 2;
                        break;
                }
            }
        }
        
        for(int score : scores){
            answer += score;
        }
        
        return answer;
    }
}