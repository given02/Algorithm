class Solution {
    boolean[] visited;
    int answer = 0;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                dfs(n, computers, visited, i);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void dfs(int n, int[][] computers, boolean[] visited, int i){
        visited[i] = true;
        
        for(int j = 0; j < n; j++){
            if(!visited[j] && i != j && computers[i][j] == 1){
                dfs(n, computers, visited, j);
            }
        }
    }
}