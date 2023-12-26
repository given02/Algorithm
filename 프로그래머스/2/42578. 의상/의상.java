import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] arr : clothes){
            map.put(arr[1], map.getOrDefault(arr[1],1) + 1);
        }
        
        Iterator<Integer> it = map.values().iterator();
        while(it.hasNext()){
            answer *= it.next().intValue();
        }
        return answer-1;
    }
}