class Solution {
    static boolean[] visited;
    static int answer;
    
    public int solution(int n, int[][] computers) {
        answer = 0;
        visited = new boolean[n];
        
        for(int i = 0; i < computers.length; i++){
            if(!visited[i]){
                DFS(n, i, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    public void DFS(int n, int i, int[][] computers) {
        visited[i] = true;
        
        for(int j = 0; j < n; j++){
            if(!visited[j] && computers[i][j] == 1){
                DFS(n, j, computers);
            }
        }
            
    }
}