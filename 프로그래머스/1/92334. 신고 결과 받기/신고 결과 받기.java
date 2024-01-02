import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 게시판 불량 이용자 신고 후 처리 결과 메일링 시스템 개발
        // 한 유저를 여러 번 신고할 수 있지만 동일한 유저에 대한 신고 횟수는 1회로 처리
        // k번 이상 신고된 유저는 게시판 이용 정지 및 신고한 유저들에게 메일 발송
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

