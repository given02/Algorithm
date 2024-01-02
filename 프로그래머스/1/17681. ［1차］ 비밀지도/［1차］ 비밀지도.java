import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i = 0; i < n; i++){
            String str1 = Integer.toBinaryString(arr1[i]);
            String str2 = Integer.toBinaryString(arr2[i]);
            str1 = "0".repeat(n - str1.length()) + str1;
            str2 = "0".repeat(n - str2.length()) + str2;
            
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < n; j++){
                if(str1.charAt(j) == '1' || str2.charAt(j) == '1'){
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        
        return answer;
    }
}