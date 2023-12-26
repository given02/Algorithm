import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // bridge_length = 다리 통과 하는 초
        // 트럭 한대가 다리를 총과하는 시간은 bridge_length + 1
        // but, 다리에 무게 여유가 있어야 다음 트럭이 들어갈 수 있음
        
        // 대기 트럭
        ArrayList<Integer> bridge = new ArrayList<>();
        for(int i = 0; i < bridge_length; i++){
            bridge.add(0);
        }
        
        int seconds = 0;
        int currentW = 0;
        int index = 0;
        while(index < truck_weights.length){
            currentW -= bridge.get(0);
            bridge.remove(0);
            seconds++;
            if(currentW + truck_weights[index] <= weight){
                bridge.add(truck_weights[index]);
                currentW += truck_weights[index++];
            } else {
                bridge.add(0);
            }
        }
        
        return seconds + bridge_length;
    }
}