class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        // 최대 공약수
        for(int i = 1; i <= Math.min(n, m); i++){
            if(n % i == 0 && m % i == 0){
                answer[0] = i;
            }
        }
        
        // 최소 공배수
        answer[1] = n * m / answer[0];
        
        return answer;
    }
}