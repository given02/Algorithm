import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < players.length; i++){
            map.put(players[i], i);
        }
        
        for(String player : callings){
            int curRank = map.get(player);
            String nextPlayer = players[curRank-1];
            
            map.put(player, map.get(player) - 1);
            map.put(nextPlayer, map.get(nextPlayer) + 1);
            players[curRank] = nextPlayer;
            players[curRank - 1] = player;
        }
        
        return players;
    }
}