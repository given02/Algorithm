import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        HashSet<String> set = new HashSet<>();
        String prev = words[0];
        set.add(words[0]);
        
        for(int i = 1; i < words.length; i++){
            if(set.contains(words[i]) || prev.charAt(prev.length()-1) != words[i].charAt(0)){
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            } else {
                set.add(words[i]);
                prev = words[i];
            }
        }

        return answer;
    }
}