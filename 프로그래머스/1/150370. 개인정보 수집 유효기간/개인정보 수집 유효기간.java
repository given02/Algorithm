import java.util.*;
import java.time.*;
class Solution {
    
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(String term : terms){
            String[] arr = term.split(" ");
            map.put(arr[0], Integer.parseInt(arr[1]));
        }
        
        for(int i = 0; i < privacies.length; i++){
            String[] arr = privacies[i].split(" ");
            LocalDate date = convertDate(arr[0]).plusMonths(map.get(arr[1]));
            LocalDate convertedToday = convertDate(today);
            
            if(!date.isAfter(convertedToday)){
                list.add(i+1);
            }
        }
        
        return list;
    }
    
    public LocalDate convertDate(String str){
        int year = Integer.parseInt(str.substring(0,4));
        int month = Integer.parseInt(str.substring(5,7));
        int day = Integer.parseInt(str.substring(8,10));
        
        return LocalDate.of(year, month, day);
    }
}