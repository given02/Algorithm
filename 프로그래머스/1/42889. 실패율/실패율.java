import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int N, int[] stages) {
        int[] pass = new int[N+1];
        int[] challenge = new int[N+1];
        
        for(int stage : stages){
            for(int j = 0; j < stage; j++){
                if(j < stage - 1){
                    pass[j]++;
                }
                challenge[j]++;
            }
        }
        
        HashMap<Integer, Double> map = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            double fail = challenge[i] - pass[i];
            double rate = fail == 0 ? 0 : Double.parseDouble(String.format("%.99f", fail / challenge[i]));
            map.put(i+1, rate);
        }
        
        ArrayList<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        
        return keySet;
    }
}