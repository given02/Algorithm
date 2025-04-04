import java.util.*;
class Solution {
    
    static Integer[][] D;
    static int N;
    
    public int solution(int[][] triangle) {
        N = triangle.length;
        D = new Integer[N][N];
        
        for(int i = 0; i < N; i++){
            D[N-1][i] = triangle[N-1][i];
        }
        
        return DP(0,0,triangle);
    }
    
    public int DP(int i, int j, int[][] t){
        if(i == N-1){
            return t[i][j];
        }
        
        if(D[i][j] == null){
            D[i][j] = t[i][j] + Math.max(DP(i+1,j,t), DP(i+1,j+1,t));
        }
        
        return D[i][j];
    }
}