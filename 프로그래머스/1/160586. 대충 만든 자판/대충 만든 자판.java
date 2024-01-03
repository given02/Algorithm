import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        HashMap<Character, Integer> keymapp = new HashMap<>();
        for(int i = 0; i < keymap.length; i++){
            for(int j = 0; j < keymap[i].length(); j++){
                char c = keymap[i].charAt(j);
                if(keymapp.containsKey(c)){
                    keymapp.put(c, Math.min(keymapp.get(c), j+1));
                } else {
                    keymapp.put(c, j+1);
                }
            }
        }
        
        for(int i = 0; i < targets.length; i++){
            for(int j = 0; j < targets[i].length(); j++){
                char c = targets[i].charAt(j);
                if(keymapp.containsKey(c)){
                    answer[i] += keymapp.get(c);
                } else {
                    answer[i] = -1;
                    break;
                }
            }
        }
        
        return answer;
    }
}