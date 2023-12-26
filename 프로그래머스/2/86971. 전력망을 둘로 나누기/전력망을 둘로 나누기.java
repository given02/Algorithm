import java.util.*;
class Solution {
    
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int min;
    
    public int solution(int n, int[][] wires) {
        min = n;
        
        list = new ArrayList[n+1];
        for(int i = 1; i <= n; i++){
            list[i] = new ArrayList<>();
        }
        
        for(int i = 0; i < wires.length; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            list[v1].add(v2);
            list[v2].add(v1);
        }
        
        for(int i = 0; i < wires.length; i++){
            int v1 = wires[i][0];
            int v2 = wires[i][1];
            visited = new boolean[n+1];
            visited[1] = true;
            
            dfs(1, v1, v2);
            
            int count = 0;
            for(int j = 1; j < visited.length; j++){
                if(visited[j]) count++;
            }
            min = Math.min(min, Math.abs(count-(n-count)));
        }
        
        return min;
    }
    
    static void dfs(int n, int v1, int v2){
        for(int num : list[n]) {
            if((n==v1 && num==v2) || (n==v2 && num==v1)) continue;
            if(!visited[num]){
                visited[num] = true;
                dfs(num, v1, v2);
            }
        }
    }
    
}