import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> giftScore = new HashMap<>();
        HashMap<String, Integer> giftsMap = new HashMap<>();
        
        for(String friend : friends){
            giftScore.put(friend, 0);
        }
        
        for(String gift : gifts){
            String[] arr = gift.split(" ");
            giftScore.put(arr[0], giftScore.get(arr[0])+1);
            giftScore.put(arr[1], giftScore.get(arr[1])-1);
            giftsMap.put(gift, giftsMap.getOrDefault(gift,0)+1);
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