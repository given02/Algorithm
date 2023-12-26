class Solution {
    public long solution(long num) {
        long answer = 0;
        
        while(num != 1){
            if(num % 2 == 0){
                num = num / 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
            
            if(num == 1){
                return answer;
            }
            if(answer > 500){
                return -1;
            }
        }
        
        return answer;
    }
}
