import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, Integer> mailMap = new HashMap<>();
        HashMap<String, Integer> reportedMap = new HashMap<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(report));
        
        for(String str : set){
            String[] arr = str.split(" ");
            reportedMap.put(arr[1], reportedMap.getOrDefault(arr[1],0)+1);
        }
        
        for (String str : set) {
            String[] arr = str.split(" ");
            if (reportedMap.get(arr[1]) >= k) {
                mailMap.put(arr[0], mailMap.getOrDefault(arr[0], 0) + 1);
            }
        }

        for(int i = 0; i < id_list.length; i++){
            if (mailMap.containsKey(id_list[i])) {
                answer[i] = mailMap.get(id_list[i]);
            }
        }
        
        return answer;
    }
}

