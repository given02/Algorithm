import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        HashMap<Integer, Integer> mapX = new HashMap<>();
        HashMap<Integer, Integer> mapY = new HashMap<>();
        
        for(String s : X.split("")){
            int num = Integer.parseInt(s);
            mapX.put(num, mapX.getOrDefault(num,0)+1);
        }
        
        for(String s : Y.split("")){
            int num = Integer.parseInt(s);
            mapY.put(num, mapY.getOrDefault(num,0)+1);
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--){
            if(mapX.containsKey(i) && mapY.containsKey(i)){
                for(int j = 0; j < Math.min(mapX.get(i), mapY.get(i)); j++){
                    sb.append(i);
                }
            }
        }
        
        if(sb.toString().equals("")) return "-1";
        if(sb.toString().startsWith("0")) return "0";

        return sb.toString();
    }
}