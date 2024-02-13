import java.util.*;

class Solution {
    public int solution(int[] elements) {
        HashSet<Integer> set = new HashSet<>();
        int[] dp = new int[elements.length];
        
        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < elements.length; j++){
                dp[i] += elements[(i+j) % elements.length];
                set.add(dp[i]);
            }
        }
        
        return set.size();
    }
}