import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("R", 0); map.put("T", 0);
        map.put("C", 0); map.put("F", 0);
        map.put("J", 0); map.put("M", 0);
        map.put("A", 0); map.put("N", 0);
        
        for(int i = 0; i < survey.length; i++){
            String[] arr = survey[i].split("");
            if(choices[i] < 4){
                map.put(arr[0], map.get(arr[0]) + Math.abs(4-choices[i]));
            } else if(choices[i] > 4){
                map.put(arr[1], map.get(arr[1]) + Math.abs(4-choices[i]));
            }
        }
        
        return (map.get("R") >= map.get("T") ? "R" : "T") + 
            (map.get("C") >= map.get("F") ? "C" : "F") + 
            (map.get("J") >= map.get("M") ? "J" : "M") + 
            (map.get("A") >= map.get("N") ? "A" : "N");
    }
}