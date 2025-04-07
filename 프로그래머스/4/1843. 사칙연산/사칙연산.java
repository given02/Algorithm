import java.util.*;

class Solution {
    
    int[][][] dp;
    int[] nums;
    int[] ops; // 0: +, 1: -
    
    public int solution(String[] arr) {
        int N = arr.length / 2 + 1;
        
        nums = new int[N];
        ops = new int[N - 1];
        
        int idx1 = 0, idx2 = 0;
        for (String s : arr) {
            if (s.equals("+")) ops[idx2++] = 0;
            else if (s.equals("-")) ops[idx2++] = 1;
            else nums[idx1++] = Integer.parseInt(s);
        }

        // dp 초기화. -1: 아직 계산 안 됨
        dp = new int[N][N][2];
        for (int[][] a : dp)
            for (int[] b : a)
                Arrays.fill(b, Integer.MIN_VALUE);
        
        return DP(0, N - 1, 1);
    }

    private int DP(int s, int e, int isMax) {
        if (s == e) return nums[s];
        if (dp[s][e][isMax] != Integer.MIN_VALUE) return dp[s][e][isMax];
        
        int res = isMax == 1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int k = s; k < e; k++) {
            int op = ops[k];
            int leftMax = DP(s, k, 1);
            int leftMin = DP(s, k, 0);
            int rightMax = DP(k + 1, e, 1);
            int rightMin = DP(k + 1, e, 0);
            
            if (op == 0) { // +
                if (isMax == 1)
                    res = Math.max(res, leftMax + rightMax);
                else
                    res = Math.min(res, leftMin + rightMin);
            } else { // -
                if (isMax == 1)
                    res = Math.max(res, leftMax - rightMin);
                else
                    res = Math.min(res, leftMin - rightMax);
            }
        }

        return dp[s][e][isMax] = res;
    }
    
}