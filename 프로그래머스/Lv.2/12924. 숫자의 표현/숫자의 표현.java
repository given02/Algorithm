class Solution {
    public int solution(int n) {
        int answer = 1;
        
        int num = 0;
        for(int i = 1; i <= n / 2; i++){
            num = i;
            for(int j = i+1; j <= n / 2 + 1; j++){
                num += j;
                if(num >= n){
                    if(num == n) answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}