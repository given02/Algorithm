import java.util.*;
class Solution {
    
    static String[] arr;
    static List<String> list;
        
    public int solution(String word) {
        int answer = 0;
        
        list = new ArrayList<>(); // 모든 경우의 수를 담을 리스트
        arr = new String[]{"A", "E", "I", "O", "U"}; // 알파벳이 담긴 배열
        
        recursion(word, "", 0); // index 0에는 "" 빈 문자열을 넣고 시작
        
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals(word)) {
                answer = i; // 모든 경우의 수를 담은 리스트에서 word가 있는 인덱스를 반환
                break;
            }
        }
        
        return answer;
    }
    
    static void recursion(String word, String str, int depth) {
        // 모든 경우의 수를 list에 담는다.
        list.add(str);
        
        if(depth == 5) {
            return;
        }
        
        for (int i = 0; i < arr.length; i++) { // 알파벳 5개를 돌면서 
            recursion(word, str + arr[i], depth + 1); // 다음 알파벳과 자릿수를 주어 반복
        }
    }
    
}