import java.util.*;

class Solution {
    public Integer[] solution(String[] genres, int[] plays) {
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
        }
        
        ArrayList<String> genre = new ArrayList<>();
        for(String key : map.keySet()){
            genre.add(key);
        }
        Collections.sort(genre, (o1,o2) -> map.get(o2).compareTo(map.get(o1)));
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<genre.size(); i++){
            String g = genre.get(i);
            
            int max = 0;
            int firstIdx = -1;
            for(int j=0; j<genres.length; j++){
                if(g.equals(genres[j]) && max < plays[j]){
                    max = plays[j];
                    firstIdx = j;
                }
            }
            
            max = 0;
            int secondIdx = -1;
            for(int j=0; j<genres.length; j++){
                if(g.equals(genres[j]) && max < plays[j] && j != firstIdx){
                    max = plays[j];
                    secondIdx = j;
                }
            }
            
            list.add(firstIdx);
            if(secondIdx >= 0){
                list.add(secondIdx);
            }
        }
        Integer[] answer = list.toArray(new Integer[list.size()]);

        return answer;
    }
}