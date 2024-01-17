import java.util.*;

public class Solution {
    public int solution(int n) {
        // 0에서 n까지 가야 함
        // 점프 k = 건전지 사용 k
        // 순간이동 = 현재까지 온 거리 * 2 위치로 이동 
        // 계속 n을 나누기 2 하면서 나머지를 계산하면 몇칸 점프 해야하는지 나옴 = 건전지 사용량
        
        int ans = 0;
        
        while(n > 0){
            if(n % 2 == 0){
                n /= 2;
            } else {
                ans += n % 2;
                n -= n % 2;
            }
        }

        return ans;
    }
}