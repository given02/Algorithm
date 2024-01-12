import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max = Integer.MAX_VALUE * -1;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            max = Math.max(max, Integer.parseInt(arr[i]));
            min = Math.min(min, Integer.parseInt(arr[i]));
        }
        
        return Integer.toString(min) + " " + Integer.toString(max);
    }
}