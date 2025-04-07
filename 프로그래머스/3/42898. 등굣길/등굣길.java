import java.util.*;

class Solution {
    
    static Integer[][] D;
    static boolean[][] isPuddle;
    
    public int solution(int m, int n, int[][] puddles) {
        D = new Integer[m][n];
        isPuddle = new boolean[m][n];
        
        for(int[] p : puddles){
            isPuddle[p[0]-1][p[1]-1] = true;
        }
        
        return DP(m-1,n-1);
    }
    
    public int DP(int m, int n){
        if(m < 0 || n < 0 || isPuddle[m][n]){
            return 0;
        }
        if(m == 0 && n == 0){
            return 1;
        }
        if (D[m][n] == null){
            D[m][n] = (DP(m-1,n) + DP(m,n-1)) % 1_000_000_007;
        }
        
        return D[m][n];
    }
    
}