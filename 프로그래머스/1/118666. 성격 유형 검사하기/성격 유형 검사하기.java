import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        String[] types = {"R","T","C","F","J","M","A","N"};
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String type : types){
            map.put(type, 0);
        }
        
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