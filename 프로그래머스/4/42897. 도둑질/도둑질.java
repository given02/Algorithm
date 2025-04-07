import java.util.*;

class Solution {
    
    public int solution(int[] money) {
        int N = money.length;
        int[] D1 = new int[N];
        int[] D2 = new int[N];
        D1[0] = D1[1] = money[0];
        D2[1] = money[1];
        
        for(int i = 2; i < N; i++){
            D1[i] = Math.max(D1[i-1], money[i] + D1[i-2]);
            D2[i] = Math.max(D2[i-1], money[i] + D2[i-2]);
        }
        
        return Math.max(D1[N-2], D2[N-1]); // 원형으로 이루어져 있기 때문에 마지막 인덱스 값을 제외하기 위해 N-2
    }
    
}