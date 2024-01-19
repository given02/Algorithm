import java.util.*;
class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1; i < arr.length; i++){
            answer = lcm(answer, arr[i]);
        }
        
        return answer;
    }
    
    private static int gcd(int a, int b){
        return a % b == 0 ? b : gcd(b, a % b);
    }
    
    private static int lcm(int a, int b){
        return a * b / gcd(a,b);
    }
}