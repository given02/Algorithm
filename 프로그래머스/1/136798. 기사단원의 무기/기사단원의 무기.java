class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int num = 0;
        
        for(int i = 1; i <= number; i++){
            num = countDivisor(i);
            answer += num > limit ? power : num;
        }
        
        return answer;
    }
    
    public int countDivisor(int num){
        int cnt = 0;
        for(int i = 1; i * i <= num; i++){
            if(num % i == 0){
                cnt += (i * i == num) ? 1 : 2;
            }
        }
        return cnt;
    }
}