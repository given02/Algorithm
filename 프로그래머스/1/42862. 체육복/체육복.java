import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(reserve);
        
        int answer = n;
        int[] arr = new int[n];
        
        for(int i = 0; i < lost.length; i++){
            arr[lost[i]-1] = -1;
        }
        
        for(int i = 0; i < reserve.length; i++){
            if(arr[reserve[i]-1] == -1){
                arr[reserve[i]-1] = 0;
                reserve[i] = -1;
            }
        }
        
        for(int i = 0; i < reserve.length; i++){
            if(reserve[i] == -1) continue;
            
            else if(reserve[i]-2 >= 0 && arr[reserve[i]-2] == -1)
                arr[reserve[i]-2] = 0;
            
            else if(reserve[i] < arr.length && arr[reserve[i]] == -1)
                arr[reserve[i]] = 0;
        }
        
        for(int i = 0; i < arr.length; i++){
            answer = answer + arr[i];
        }
        
        return answer;
    }
}