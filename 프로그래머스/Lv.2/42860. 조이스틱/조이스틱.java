import java.util.*;
class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        int moves = len - 1;
        int idx = 0;
        
        for(int i = 0; i < len; i++){
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            
            idx = i + 1;
            while(idx < len && name.charAt(idx) == 'A'){
                idx++;
            }
            
            moves = Math.min(moves, i + i + len - idx);
            moves = Math.min(moves, (len - idx) * 2 + i);
        }
        
        return answer + moves;
    }
}