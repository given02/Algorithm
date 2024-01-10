import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> giftsMap = new HashMap<>();
        HashMap<String, Integer> sended = new HashMap<>();
        HashMap<String, Integer> recieved = new HashMap<>();
        HashMap<String, Integer> giftScore = new HashMap<>();
        
        for(String gift : gifts){
            String[] arr = gift.split(" ");
            sended.put(arr[0], sended.getOrDefault(arr[0],0)+1);
            recieved.put(arr[1], recieved.getOrDefault(arr[1],0)+1);
            giftsMap.put(gift, giftsMap.getOrDefault(gift,0)+1);
        }
        
        for(String friend : friends){
            giftScore.put(friend, 
                          (sended.containsKey(friend) ? sended.get(friend) : 0) - 
                          (recieved.containsKey(friend) ? recieved.get(friend) : 0));
        }
        
        int[] giftForNextMonth = new int[friends.length];
        for(int i = 0; i < friends.length; i++){
            for(int j = i+1; j < friends.length; j++){
                String A = friends[i] + " " + friends[j];
                String B = friends[j] + " " + friends[i];
                int cntA = giftsMap.containsKey(A) ? giftsMap.get(A) : 0;
                int cntB = giftsMap.containsKey(B) ? giftsMap.get(B) : 0;
                
                if(cntA == cntB){
                    int scoreA = giftScore.get(friends[i]);
                    int scoreB = giftScore.get(friends[j]);
                    if(scoreA != scoreB){
                        giftForNextMonth[scoreA > scoreB ? i : j]++;
                    }
                } else {
                    giftForNextMonth[cntA > cntB ? i : j]++;
                }
            }
        }
        
        int answer = 0;
        for(int i : giftForNextMonth){
            answer = Math.max(answer, i);
        }
        
        return answer;
    }
}