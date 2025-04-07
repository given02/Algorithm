import java.util.*;

class Solution {
    
    public int solution(String arr[]) {
        int N = arr.length/2+1;
        
        int[] nums = new int[N];
        int[] ops = new int[N-1];
        
        int idx1 = 0;
        int idx2 = 0;
        for(String s : arr){
            if(s.equals("+")){
                ops[idx2++] = 0;
            } else if(s.equals("-")){
                ops[idx2++] = 1;
            }else {
                nums[idx1++] = Integer.parseInt(s);
            }
        }
        
        int[][][] dp = new int[N][N][2];
        // 자기자신만 괄호친 경우
        for(int i = 0; i < N; i++){
            dp[i][i][0] = dp[i][i][1] = nums[i];
        }
        
        for(int i = 1; i < N; i++){ // 0,0은 초기화 됐으니까 0,1부터 시작하기 위해 i=1
            for(int s = 0; s < N; s++){
                if(i + s >= N) break;
                int e = i + s;
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                for(int j = s; j < e; j++){
                    if(ops[j] == 0){
                        max = Math.max(max, dp[s][j][1] + dp[j+1][e][1]);
                        min = Math.min(min, dp[s][j][0] + dp[j+1][e][0]);
                    }
                    else {
                        max = Math.max(max, dp[s][j][1] - dp[j+1][e][0]);
                        min = Math.min(min, dp[s][j][0] - dp[j+1][e][1]);
                    }
                }
                dp[s][e][0] = min;
                dp[s][e][1] = max;
            }
        }
        
        return dp[0][N-1][1];
    }
    
}