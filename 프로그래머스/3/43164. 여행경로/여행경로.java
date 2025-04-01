import java.util.*;

class Solution {
    
    static List<String> allRoute = new ArrayList<>();
    static boolean[] visited;
    
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];

        DFS(tickets, "ICN", "ICN", 0);
        
        Collections.sort(allRoute);
        
        return allRoute.get(0).split(" ");
    }
    
    public void DFS(String[][] tickets, String start, String route, int cnt){
        if(cnt == tickets.length){
            allRoute.add(route);
            return;
        }
        
        
        for(int i = 0; i < tickets.length; i++){
            if(!visited[i] && start.equals(tickets[i][0])){
                visited[i] = true;
                DFS(tickets, tickets[i][1], route + " " + tickets[i][1], cnt+1);
                visited[i] = false;
            }
        }
    }
}