import java.util.*;
class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder(s.toLowerCase());
        int idx = 0;
        
        for(String str : s.split(" ")){
            sb.setCharAt(idx, Character.toUpperCase(sb.charAt(idx)));
            idx += str.length()+1;
        }
        
        return sb.toString();
    }
}