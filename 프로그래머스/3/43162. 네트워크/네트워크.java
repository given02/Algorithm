class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] isChecked = new boolean[n];
        
        for(int i = 0; i < n; i++){
            if(!isChecked[i]){
                dfs(n, computers, isChecked, i);
                answer++;
            }
        }
        
        
        return answer;
    }
    
    public void dfs(int n, int[][] computers, boolean[] isChecked, int i){
        isChecked[i] = true;
        
        for(int j = 0; j < n; j++){
            if(!isChecked[j] && i != j && computers[i][j] == 1){
                dfs(n, computers, isChecked, j);
            }
        }
    }
}